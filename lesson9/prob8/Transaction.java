package edu.mum.lesson9.prob8;
import java.util.Comparator;

public class Transaction implements Comparable<Transaction>{

	private Trader trader;
	private int year;
	private int value;

	public Transaction(Trader trader, int year, int value)
	{
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader(){ 
		return this.trader;
	}

	public int getYear(){
		return this.year;
	}

	public int getValue(){
		return this.value;
	}
	
        @Override
	public String toString(){
	    return "{" + this.trader + ", " +
	           "year: "+this.year+", " +
	           "value:" + this.value +"}";
	}

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.year;
        hash = 31 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaction other = (Transaction) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        return true;
    }                
    
    @Override
    public int compareTo(Transaction o) {
        if (o == null) {
            return -1;
        }
        if(this.getValue()==o.getValue()) {
            return 0;
        }
        if(this.getValue() > o.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}