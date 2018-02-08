/**
 * 
 */
package in.core.serialization;

import java.io.Serializable;

/**
 * @author Prasad Boini
 *
 */
public class Parent implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5069682294708760482L;
	private transient Integer parentId;

	public Parent(Integer parentId) {
		super();
		this.parentId = parentId;
		System.out.println("Parent-->"+parentId);
	}
	public Parent() {
		System.out.println("Parent Default-->");
	}

	public Integer getParentId() {
		return parentId;
	}
}
