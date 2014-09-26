package es.indarsoft.iso8583core.app;

import org.apache.log4j.Logger;

/**
 * Application.
 * <p>
 * Load a ISO8583 application from an external XML file an stores the info in a {@link AppBean} <br>
 * <br>
 * @author fjavier.porras@gmail.com
 *
 */
public final class  Application {

	static Logger log = Logger.getLogger( Application.class.getName() );
//	
	private AppBean apb  = null ;
	
	private Application ( String a ){
		
		LoadXmlField lxmlf = new LoadXmlField( ) ;
		apb = lxmlf.parseIso8583Xml( a ) ;
	}

	private Application ( String b, String a ){
		
		LoadXmlField lxmlf = new LoadXmlField( ) ;
		apb = lxmlf.parseAppXml( b ,  a) ;
	}
	/**
	 * Static Constructor loads the Application from a XML filename
	 * <p>
	 * @param mainxmlfile
	 * 			XML filename to load
	 * @return new instance
	 */
	protected static Application getMainInstance( String mainxmlfile ) {
		
		return new Application( mainxmlfile );
	}
	/**
	 * Static Constructor loads the Application from 2 XML's files.
	 * Information stored in the second file, overloads the information stored in the first one <br>
	 * <p>
	 * @param appxmlfile
	 * 			first XML filename to load
	 * @param mainxmlfile
	 * 			second XML filename to load 
	 * @return new instance
	 */
	protected static Application getAppInstance ( String appxmlfile, String mainxmlfile  ) {
	
		return new Application( appxmlfile, mainxmlfile  );
	}
	
	public AppBean getAppBean () {

		return apb ;
	}
}
