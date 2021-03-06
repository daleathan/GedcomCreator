/**
 *    Copyright 2013 Thomas Naeff (github.com/thnaeff)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.thn.gedcom.creator.structures;

import ch.thn.gedcom.data.GedcomTree;
import ch.thn.gedcom.store.GedcomStore;

/**
 * @author Thomas Naeff (github.com/thnaeff)
 *
 */
public class GedcomEOF extends AbstractGedcomStructure {

	
	/**
	 * A new {@link AbstractGedcomStructure#END_OF_FILE} with the given ID
	 * 
	 * @param store
	 */
	public GedcomEOF(GedcomStore store) {
		super(store, END_OF_FILE);
		
		createAndSet(new GedcomDataEmpty(false, "TRLR"));
	}
	
	/**
	 * Creates a new individual using the given gedcom head node ({@link GedcomTree}) 
	 * which has to be a {@link AbstractGedcomStructure#END_OF_FILE} structure.
	 * 
	 * @param store
	 * @param gedcomHeadNode
	 */
	public GedcomEOF(GedcomStore store, GedcomTree gedcomHeadNode) {
		super(store, END_OF_FILE, gedcomHeadNode, "TRLR");
	}
	
	@Override
	public String getStructureName() {
		return AbstractGedcomStructure.END_OF_FILE;
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public boolean setChangeDate(String changeDate, String changeTime) {
		throw new UnsupportedOperationException("No change date available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public String getChangeDate() {
		throw new UnsupportedOperationException("No change date available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public boolean removeChangeDate() {
		throw new UnsupportedOperationException("No change date available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public String getChangeTime() {
		throw new UnsupportedOperationException("No change time available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public boolean removeChangeTime() {
		throw new UnsupportedOperationException("No change time available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public boolean setNote(int index, String note) {
		throw new UnsupportedOperationException("No notes available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public boolean addNote(String note) {
		throw new UnsupportedOperationException("No notes available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public String getNote(int index) {
		throw new UnsupportedOperationException("No notes available in END_OF_FILE structures.");
	}
	
	/**
	 * Not available for END_OF_FILE structures
	 * 
	 */
	@Override
	public boolean removeNote(int index) {
		throw new UnsupportedOperationException("No notes available in END_OF_FILE structures.");
	}

}
