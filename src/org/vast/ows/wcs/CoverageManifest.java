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
    Alexandre Robin <alexandre.robin@spotimage.fr>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.ows.wcs;

import java.util.ArrayList;
import org.vast.ows.OWSIdentification;
import org.vast.ows.OWSReferenceGroup;


/**
 * <p><b>Title:</b><br/>
 * WCS GetCoverage Response
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Container for GetCoverage response
 * </p>
 *
 * <p>Copyright (c) 2007</p>
 * @author Alex Robin
 * @date Oct 11, 2007
 * @version 1.0
 */
public class CoverageManifest extends OWSIdentification
{
    protected String version;
	protected ArrayList<OWSReferenceGroup> coverages;
		
	
	public CoverageManifest()
    {    
        coverages = new ArrayList<OWSReferenceGroup>();
    }


	public ArrayList<OWSReferenceGroup> getCoverages()
	{
		return coverages;
	}


	public String getVersion()
	{
		return version;
	}


	public void setVersion(String version)
	{
		this.version = version;
	}	
}