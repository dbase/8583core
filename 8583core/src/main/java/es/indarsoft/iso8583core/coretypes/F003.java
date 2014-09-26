package es.indarsoft.iso8583core.coretypes;

import es.indarsoft.iso8583core.types.Field;
import es.indarsoft.iso8583core.types.TypeFixed;

/** Application : ISO8583CORE  - Class F003 - Processing code.
 * 
 */
public class F003 extends TypeFixed {
	
	private F003 (byte[] bytearr, Field field) {
		
		super( bytearr, field ) ;
    	if ( ! super.isValid() ){
    		return;
		}		
	}	
	
	/** Static constructor .
	 * 
	 * @param 	bytearr
	 * @return	{@link F003 } 
	 */			
    protected static F003 get ( byte[] bytearr, Field field ){   	
    	return new F003 ( bytearr, field ) ;
    }
}