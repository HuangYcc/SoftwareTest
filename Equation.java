package com.source;

import java.io.OutputStream;

class Equation {
	private double a;
	private double b;
	private static double c;

	Equation(){//�޲ι���
		a = 0;
		b = 0;
		c = 0;
	}
	Equation(double a,double b,double c){//�вι���
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getA() {
		return a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getB() {
		return b;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getC() {
		return c;
	}
	
	
	
	
	public double getDlt() {//�б�ʽ
		double result = Math.pow(b, 2)-4*a*c;
		return result;
	}
	
	private double getRightRoot() {//����Ҳ�ϴ�ʵ���ķ���
		double rightRoot;//= 0
		rightRoot = (-b+Math.sqrt(getDlt()))/(2*a);
		return rightRoot;
	}

	private double getLeftRoot() {//�������Сʵ���ķ���
		double LeftRoot  ;//= 0
		LeftRoot = (-b-Math.sqrt(getDlt()))/(2*a);
		return LeftRoot;
	}
	public void getRoot() //��ʾʵ���򸴸�,���
	{
		if(a == 0)
		{
			if(b==0)
			{
				if(c==0)
				{//ȫΪ0������
					System.out.println("һԪ���η��̣�"+getA()+"x^2+"+getB()+"x+"+getC()+"��������");
				}
				else	
				{
					System.out.println("һԪ���η��̣�"+getA()+"x^2+"+getB()+"x+"+getC()+"�޽�");
				}
			}
			else
			{			
				double result = 0;
			    result = -getC()/getB();
				System.out.println("һԪ���η��̣�"+getA()+"x^2+"+getB()+"x+"+getC()+"Ψһ��"+result);
			}
		}
		else//����ϵ����Ϊ0������ʵ���򸴸�
		{
			if(getDlt() == 0)//�б�ʽΪ0�����������ֵ
			{
				double result;
				result = -getB()/(2*getA());
				System.out.println("һԪ���η��̣�"+getA()+"x^2+"+getB()+"x+"+getC()+"Ψһ��"+result  );
			}
			else if(getDlt()>0)//��������ʵ��
			{
				System.out.println("һԪ���η��̣�"+getA()+"x^2+"+getB()+"x+"+getC()+"������ʵ����"+
							getLeftRoot()+"��"+getRightRoot());
			}
			else//�б�ʽС��0������������
			{
				double imaginaryNumber = 0;
				double realNumber = 0;
				imaginaryNumber = Math.sqrt(-getDlt())/(2*a);
				realNumber = -getB()/(2*a);
				System.out.println("һԪ���η��̣�"+getA()+"x^2+"+getB()+"x+"+getC()+"����������"+
				realNumber+"i"+"��"+imaginaryNumber+"i");
			}
		}
		
	}
	
	public static class Test1{
		public static void main(String[] args) {
			System.out.print("1---");
			Equation e1 = new Equation(0,0,0);
			e1.getRoot();
			System.out.print("2---");
			Equation e2 = new Equation(0,0,1);
			e2.getRoot();            
			System.out.print("3---");
			Equation e3 = new Equation(0,1,0);
			e3.getRoot();
			System.out.print("4---");
			Equation e4 = new Equation(0,1,1);
			e4.getRoot();
			System.out.print("5---");
			Equation e5 = new Equation(1,2,1);
			e5.getRoot();
			System.out.print("6---");
			Equation e6 = new Equation(1,4,1);
			e6.getRoot();
			System.out.print("7---");
			Equation e7 = new Equation(2,3,3);
			e7.getRoot();
		}
	}	

}
