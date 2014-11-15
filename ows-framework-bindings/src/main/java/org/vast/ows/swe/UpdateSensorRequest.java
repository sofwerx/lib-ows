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
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.ows.swe;

import net.opengis.sensorml.v20.AbstractProcess;
import org.vast.ows.OWSRequest;


/**
 * <p><b>Title:</b><br/>
 * UpdateSensor Request
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Container for SWES UpdateSensor request parameters
 * </p>
 *
 * <p>Copyright (c) 2014</p>
 * @author Alexandre Robin
 * @date Feb 02, 2014
 * @version 1.0
 */
public class UpdateSensorRequest extends OWSRequest
{
    protected String procedureId;
    protected String procedureDescriptionFormat;
    protected AbstractProcess procedureDescription;  
    
	
	public UpdateSensorRequest(String serviceType)
    {
        service = serviceType;
		operation = "UpdateSensorDescription";
	}


    public String getProcedureId()
    {
        return procedureId;
    }


    public void setProcedureId(String procedureId)
    {
        this.procedureId = procedureId;
    }


    public String getProcedureDescriptionFormat()
    {
        return procedureDescriptionFormat;
    }


    public void setProcedureDescriptionFormat(String procedureDescriptionFormat)
    {
        this.procedureDescriptionFormat = procedureDescriptionFormat;
    }


    public AbstractProcess getProcedureDescription()
    {
        return procedureDescription;
    }


    public void setProcedureDescription(AbstractProcess procedureDescription)
    {
        this.procedureDescription = procedureDescription;
    }
}