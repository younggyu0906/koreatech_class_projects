// LinkedList Ŭ������ Queue �������̽��� �����Ѵ�
// ���� Queue�� LinkedList�� ����Ͽ� �ۼ��� �� �ִ�

import java.util.LinkedList;

public class Pro04_Queue {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i <= 10; i++)
			queue.add(i);
		System.out.println(queue);
		
		queue.offer(11);	// add�� ����
		System.out.println(queue);
		
		System.out.println(queue.element());// ù���� ���� ����, �������� �ʴ´�
		System.out.println(queue);
		
		System.out.println(queue.peek());//ù��° ���� ����, �������� �ʴ´�
		System.out.println(queue);
		
		System.out.println(queue.remove());	// ù��° ���� ����, �����Ѵ�
		System.out.println(queue);
		
		System.out.println(queue.poll());//ù��° ���� ����, �����Ѵ�
		System.out.println(queue);
		
		System.out.println(queue.get(2));//��ȣ�� �ִ� ���� ����, �������� �ʴ´�
		System.out.println("size : " + queue.size());
	}
}
// 	����	   : exception�߻�	null, true, false ����
// insert  : add(e)			offer(e)
// remove  : remove()		poll()
// examine : element()		peek()