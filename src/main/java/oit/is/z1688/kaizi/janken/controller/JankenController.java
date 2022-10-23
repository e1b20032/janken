package oit.is.z1688.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.thymeleaf.engine.AttributeName;

import oit.is.z1688.kaizi.janken.model.Janken;

@Controller
public class JankenController {

  @GetMapping("/janken")
  public String janken() {
    return "janken.html";
  }

  /**
   * POSTを受け付ける場合は@PostMappingを利用する /sample25へのPOSTを受け付けて，FormParamで指定された変数(input
   * name)をsample25()メソッドの引数として受け取ることができる
   *
   * @param kakeru1
   * @param kakeru2
   * @param model
   * @return
   */
  @PostMapping("/janken")
  public String jankenpost(@RequestParam String name, ModelMap model) {
    model.addAttribute("yourname", name);
    return "janken.html";
  }

  @GetMapping("/jankengame")
  public String janken(@RequestParam String hand, ModelMap model) {

    String yourhand = hand;
    String cpuHand = "Gu";

    Janken janken = new Janken(yourhand, cpuHand);

    model.addAttribute("yourhand", yourhand);
    model.addAttribute("cpuhand", janken.getCpuHand());
    model.addAttribute("kekka", janken.getKekka());
    return "janken.html";

  }
}
