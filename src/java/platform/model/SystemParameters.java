/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.model;

/**
 *
 * @author Vladimir Tomic
 */
public class SystemParameters {

    private int id;
    private boolean automaticRequestProcessing;

    public SystemParameters(int id, boolean automaticRequestProcessing) {
        this.id = id;
        this.automaticRequestProcessing = automaticRequestProcessing;
    }

    public SystemParameters() {
        this(0, false);
    }

    public boolean isAutomaticRequestProcessing() {
        return automaticRequestProcessing;
    }

    public void setAutomaticRequestProcessing(boolean automaticRequestProcessing) {
        this.automaticRequestProcessing = automaticRequestProcessing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
