package com.ryan.test;

import java.awt.print.Printable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;


public class Homework7 {
	public static void main(String[] args) throws FileNotFoundException, Exception {
		homework1();
		apnd();
		copyFile(new FileInputStream("C:\\TGA105_Workspace\\JavaTest\\src\\test\\Data.txt"), 
				new FileOutputStream("C:\\TGA105_Workspace\\JavaTest\\src\\test\\newData.txt"));
		
		dogcat();
		
		redogcat();
		
	}

	// 1.請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
	public static void homework1() {
		File fil = new File("C:\\TGA105_Workspace\\JavaTest\\src\\test\\sample.txt");
		try {
			FileInputStream fis = new FileInputStream(fil);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int countByte = 0;
			while ((bis.read()) != -1) {
				countByte++;
			}
			bis.close();
			fis.close();

			FileReader fir = new FileReader(fil);
			BufferedReader br = new BufferedReader(fir);
			int countChar = 0;
			int countLine = 0;
			String str;
			while ((str = br.readLine()) != null) {
				countChar += str.length();
				countLine++;
			}
			br.close();
			fir.close();
			System.out.println(countByte + "個位元組 " + countChar + "個字元 " + countLine + "列");
		} catch (Exception e) {

		}
	}

	// 2.請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用append功能讓每次執行結果都能被保存起來)
	public static void apnd() {
		try {
			String radom = "";
			for (int i = 1; i <= 10; i++) {
				radom += (int) (Math.random() * 1001) + 1 + ",";
			}
			FileOutputStream fiso = new FileOutputStream("C:\\TGA105_Workspace\\JavaTest\\src\\test\\Data.txt", true);
			BufferedOutputStream biso = new BufferedOutputStream(fiso);

			PrintStream ps = new PrintStream(biso);
			ps.println(radom);

			ps.close();
			biso.close();
			fiso.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 3.請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
	public static void copyFile(FileInputStream a, FileOutputStream b) throws Exception {
		BufferedInputStream bisOld = new BufferedInputStream(a);
		BufferedOutputStream bosNew = new BufferedOutputStream(b);

		int c;
		while ((c = bisOld.read()) != -1) {
			bosNew.write(c);
		}

		bosNew.close();
		bisOld.close();
		a.close();
		b.close();
	}
		//4.請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
		//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	
		public static void dogcat() throws IOException {

			File dir = new File("C:\\data");
			if (!dir.exists()) {
				dir.mkdir();
			}
			
				Animal1[] animal1s = new Animal1[4];
				animal1s[0] = new Dogg("Black");
				animal1s[1] = new Dogg("Yellow");
				animal1s[2] = new Cat("White");
				animal1s[3] = new Cat("Gray");
				

				FileOutputStream fio = new FileOutputStream("C:\\data\\Object.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fio);
				for(int i = 0; i < animal1s.length; i++) {
					oos.writeObject(animal1s[i]);
				}
				oos.flush();
							
				oos.close();
				fio.close();
				System.out.println("資料輸出成功");
				
			
		}

		// 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
		// 型簡化本題的程式設計)
		public static void redogcat() throws IOException {
			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				for (int i = 0; i < 4; i++) {
					((Animal1) ois.readObject()).speak();
				}
				ois.close();
				fis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
