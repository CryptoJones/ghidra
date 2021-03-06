/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package help.validator.links;

import help.validator.model.IMG;

/**
 * A link that represents the case where the HTML tried to reference a runtime Java image, but 
 * that value is not found
 */
public class InvalidRuntimeIMGFileInvalidLink extends InvalidIMGLink {

	private static final String MESSAGE =
		"Runtime image not found (e.g., Icons.XYZ_ICON not found)";

	public InvalidRuntimeIMGFileInvalidLink(IMG img) {
		super(img, MESSAGE);
	}
}
