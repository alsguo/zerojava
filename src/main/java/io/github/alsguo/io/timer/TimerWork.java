package io.github.alsguo.io.timer;

import java.util.Timer;
import java.util.TimerTask;
//No.1
//开始写代码。需求：定义一个定时任务，可以在创建该任务对象的时候指定一个名字，每隔一段时间输出该任务的名字以及一个递增的数字

class TimePrinter extends TimerTask {

	int i = 0;

	@Override
	public void run() {
		System.out.println("No." + i++);
	}

}

// end_code

public class TimerWork {
	public static void main(String args[]) {
		// No.2
		// 开始写代码。需求：使用上面定义的定时任务类，启动2个定时任务，任务名称分别为first和second，first马上启动任务，每隔2秒重复执行一次；second在3秒之后启动任务，每隔1秒执行一次
		Timer first = new Timer("first");
		first.schedule( new TimePrinter(), 0,2000);
		Timer second = new Timer("second");
		second.schedule( new TimePrinter(), 3000,1000);
		// end_code
	}
}