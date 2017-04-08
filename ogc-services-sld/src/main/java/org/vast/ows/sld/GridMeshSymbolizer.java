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
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.ows.sld;

/**
 * <p>
 * SLD-X Grid Mesh Symbolizer object.
 * To render data as a mesh with the given Stroke parameters.
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @date Aug 02, 2006
 * */
public class GridMeshSymbolizer extends GridSymbolizer
{
	protected Stroke stroke;


	public Stroke getStroke()
	{
		if (stroke == null)
            stroke = new Stroke();
        
        return stroke;
	}


	public void setStroke(Stroke stroke)
	{
		this.stroke = stroke;
	}
}