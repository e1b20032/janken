package oit.is.z1688.kaizi.janken.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


/**
 * Spring BootでModelとして扱われるクラス フレームワークがフィールドに値を代入したり，取得したりするため，getter/setterが必要
 */
@Component
public class Janken {
  ArrayList<Double> numList = new ArrayList<>();
  double ave;


  // コンストラクタ
  public Janken(ArrayList<Double> numList) {
    this.numList = numList;
    double sum = 0;
    for (Double num : numList) {
      sum = sum + num;
    }
    ave = sum / numList.size();
  }

  public ArrayList<Double> getNumList() {
    return numList;
  }

  public void setNumList(ArrayList<Double> numList) {
    this.numList = numList;
  }

  public double getAve() {
    return ave;
  }

  public void setAve(double ave) {
    this.ave = ave;
  }
}
