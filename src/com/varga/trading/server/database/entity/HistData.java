package com.varga.trading.server.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_hist")
public class HistData {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="trade_pair")
	private String tradePair;
	
	@Column(name="dt_data")
	private Date dateData;
	
	@Column(name="price_last")
	private double priceLast;
	
	@Column(name="price_prevday")
	private double pricePrevDay;
	
	@Column(name="daily_low")
	private double dailyLowPrice;
	
	@Column(name="daily_high")
	private double dailyHighPrice;
	
	@Column(name="daily_volume")
	private double dailyVolume;
	
	@Column(name="price_buy_offer")
	private double priceBuyOffer;
	
	@Column(name="price_sell_offer")
	private double priceSellOffer;
	
	@Column(name="open_buy_orders")
	private int openBuyOrders;
	
	@Column(name="open_sell_orders")
	private int openSellOrders;
	
	public HistData() {
		
	}

	
	public HistData(String tradePair, Date dateData, double priceLast, double pricePrevDay, double dailyLowPrice,
			double dailyHighPrice, double dailyVolume, double priceBuyOffer, double priceSellOffer, int openBuyOrders,
			int openSellOrders) {
		super();
		this.tradePair = tradePair;
		this.dateData = dateData;
		this.priceLast = priceLast;
		this.pricePrevDay = pricePrevDay;
		this.dailyLowPrice = dailyLowPrice;
		this.dailyHighPrice = dailyHighPrice;
		this.dailyVolume = dailyVolume;
		this.priceBuyOffer = priceBuyOffer;
		this.priceSellOffer = priceSellOffer;
		this.openBuyOrders = openBuyOrders;
		this.openSellOrders = openSellOrders;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTradePair() {
		return tradePair;
	}


	public void setTradePair(String tradePair) {
		this.tradePair = tradePair;
	}


	public Date getDateData() {
		return dateData;
	}


	public void setDateData(Date dateData) {
		this.dateData = dateData;
	}


	public double getPriceLast() {
		return priceLast;
	}


	public void setPriceLast(double priceLast) {
		this.priceLast = priceLast;
	}


	public double getPricePrevDay() {
		return pricePrevDay;
	}


	public void setPricePrevDay(double pricePrevDay) {
		this.pricePrevDay = pricePrevDay;
	}


	public double getDailyLowPrice() {
		return dailyLowPrice;
	}


	public void setDailyLowPrice(double dailyLowPrice) {
		this.dailyLowPrice = dailyLowPrice;
	}


	public double getDailyHighPrice() {
		return dailyHighPrice;
	}


	public void setDailyHighPrice(double dailyHighPrice) {
		this.dailyHighPrice = dailyHighPrice;
	}


	public double getDailyVolume() {
		return dailyVolume;
	}


	public void setDailyVolume(double dailyVolume) {
		this.dailyVolume = dailyVolume;
	}


	public double getPriceBuyOffer() {
		return priceBuyOffer;
	}


	public void setPriceBuyOffer(double priceBuyOffer) {
		this.priceBuyOffer = priceBuyOffer;
	}


	public double getPriceSellOffer() {
		return priceSellOffer;
	}


	public void setPriceSellOffer(double priceSellOffer) {
		this.priceSellOffer = priceSellOffer;
	}


	public int getOpenBuyOrders() {
		return openBuyOrders;
	}


	public void setOpenBuyOrders(int openBuyOrders) {
		this.openBuyOrders = openBuyOrders;
	}


	public int getOpenSellOrders() {
		return openSellOrders;
	}


	public void setOpenSellOrders(int openSellOrders) {
		this.openSellOrders = openSellOrders;
	}


	@Override
	public String toString() {
		return "TableHistData [id=" + id + ", tradePair=" + tradePair + ", dateData=" + dateData + ", priceLast="
				+ priceLast + ", pricePrevDay=" + pricePrevDay + ", dailyLowPrice=" + dailyLowPrice
				+ ", dailyHighPrice=" + dailyHighPrice + ", dailyVolume=" + dailyVolume + ", priceBuyOffer="
				+ priceBuyOffer + ", priceSellOffer=" + priceSellOffer + ", openBuyOrders=" + openBuyOrders
				+ ", openSellOrders=" + openSellOrders + "]";
	}
	
	
}
