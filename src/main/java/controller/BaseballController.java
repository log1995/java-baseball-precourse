package controller;

import service.BaseballService;

public class BaseballController {

    private BaseballService baseballService;

    public BaseballController() {
        this.baseballService = new BaseballService();
    }

    public void run() {
        do {
            baseballService.initBaseballGame();
            startGame();
        }while(baseballService.askReGame());

    }

    public void startGame() {
        do {
            baseballService.startBaseballGame();
        }while(baseballService.isThreeStrike());
    }
}


