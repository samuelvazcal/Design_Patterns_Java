package com.samuelvazquez.guru_examples.behavioral.state;

import com.samuelvazquez.guru_examples.behavioral.state.ui.Player;
import com.samuelvazquez.guru_examples.behavioral.state.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
