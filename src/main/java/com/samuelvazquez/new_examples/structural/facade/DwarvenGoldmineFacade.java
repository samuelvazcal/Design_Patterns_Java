package com.samuelvazquez.new_examples.structural.facade;

import java.util.Collection;
import java.util.List;

/**
 * Class to operate all these goldmine workers we have in our application
 */
public class DwarvenGoldmineFacade {
    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade() {
        workers = List.of(new DwarvenGoldDigger(), new DwarvenCartOperator(), new DwarvenTunnelDigger());
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers,
                                    DwarvenMineWorker.Action... actions) {
        workers.forEach(worker -> worker.action(actions));
    }

    public void startNewDay() {
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }
}
