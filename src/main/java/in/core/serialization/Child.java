/**
 * 
 */
package in.core.serialization;

import java.io.Serializable;

/**
 * @author Prasad
 *
 */
public class Child extends Parent implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3392592214519634431L;
	private Integer childId;
	private int addSome;

	public Child(Integer parentId, Integer childId) {
		super(parentId);
		this.childId = childId;
		System.out.println("Child-->" + childId);
	}

	public Child() {
		System.out.println("Child Default-->");
	}

	public Integer getChildId() {
		return childId;
	}

	public int getAddSome() {
		return addSome;
	}

	public void setAddSome(int addSome) {
		this.addSome = addSome;
	}

}
