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

package org.vast.ows.wcst;

import org.vast.ows.OWSReferenceGroup;


public class CoverageTransaction extends OWSReferenceGroup
{
	public final static String ADD = "Add";
	public final static String DELETE = "Delete";
	public final static String UPDATE = "Update";
	public final static String UPDATE_METADATA = "UpdateMetadata";
	
	public final static String COVERAGE_PIXELS = "urn:ogc:def:role:WCS:1.1:Pixels";
    public final static String COVERAGE_DESCRIPTION = "urn:ogc:def:role:WCS:1.1:CoverageDescription";
    public final static String COVERAGE_TRANSFORMATION = "urn:ogc:def:role:WCS:1.1:GeoreferencingTransformation";
    
    //protected Polygon updateZone ?? 
}