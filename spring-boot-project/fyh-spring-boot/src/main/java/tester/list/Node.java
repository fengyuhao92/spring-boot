package tester.list;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/14 12:39 AM
 */
public class Node {

	public volatile Node prev;
	public volatile Node next;

	public Integer value;


	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Node(Integer value){
		value=value;
	}

	public Node predocessor(){
		Node p = prev;
		return p;
	}
}
