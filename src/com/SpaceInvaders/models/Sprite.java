package com.SpaceInvaders.models;

import java.awt.Image;
import java.util.Iterator;

public abstract class Sprite {

    private Image image;
    private boolean dead;

    protected int x; // horizontal
    protected int y;  // vertical
    protected int dx;  // movement in x axis

    public abstract void move();

    public Sprite() {
        this.dead = false;
    }
    public void die() {
        this.dead = true;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    }