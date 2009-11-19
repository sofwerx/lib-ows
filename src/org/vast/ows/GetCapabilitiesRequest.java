/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Original Code is the "OGC Service Framework".
 
 The Initial Developer of the Original Code is the VAST team at the
 
 Contributor(s): 
    Alexandre Robin <robin@nsstc.uah.edu>
    Tony Cook <tcook@nsstc.uah.edu>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.ows;


/**
 * <p><b>Title:</b><br/>
 * GetCapabilities Query
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Container for GetCapabilities query parameters
 * </p>
 *
 * <p>Copyright (c) 2007</p>
 * @author Alex Robin
 * @date Sep 21, 2007
 * @version 1.0
 */
public class GetCapabilitiesRequest extends OWSRequest
{
    protected String section;
	
    
    public GetCapabilitiesRequest()
    {
        service = "OWS";
        operation = "GetCapabilities";
    }


	public String getSection()
	{
		return section;
	}


	public void setSection(String section)
	{
		this.section = section;
	}
}