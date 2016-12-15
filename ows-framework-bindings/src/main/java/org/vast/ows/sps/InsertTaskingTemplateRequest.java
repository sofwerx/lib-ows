/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Original Code is the "OGC Service Framework".
 
 The Initial Developer of the Original Code is Sensia Software LLC.
 Portions created by the Initial Developer are Copyright (C) 2014
 the Initial Developer. All Rights Reserved.
 
 Please Contact Alexandre Robin <alex.robin@sensiasoftware.com> or
 Mike Botts <mike.botts@botts-inc.net> for more information.
 
 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.ows.sps;

import net.opengis.swe.v20.DataEncoding;
import net.opengis.swe.v20.DataComponent;
import org.vast.ows.OWSRequest;


/**
 * <p>
 * Container for SPS InsertTaskingTemplate request parameters
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @date Dec 14, 2016
 * */
public class InsertTaskingTemplateRequest extends OWSRequest
{
    protected String offering;
    protected DataComponent taskingParameters;
    protected DataEncoding encoding;
    
	
	public InsertTaskingTemplateRequest()
	{
		service = SPSUtils.SPS;
		operation = "InsertTaskingTemplate";
	}


    public String getOffering()
    {
        return offering;
    }


    public void setOffering(String offering)
    {
        this.offering = offering;
    }


    public DataComponent getTaskingParameters()
    {
        return taskingParameters;
    }


    public void setTaskingParameters(DataComponent resultStructure)
    {
        this.taskingParameters = resultStructure;
    }


    public DataEncoding getEncoding()
    {
        return encoding;
    }


    public void setEncoding(DataEncoding encoding)
    {
        this.encoding = encoding;
    }
    
}