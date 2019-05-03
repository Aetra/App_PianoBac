package iutsd.android.td1.hajberta.app_pt_piano.PianoBacSable;

import android.graphics.RectF;

/** Création des touches du piano */
public class Key {
    public int sound;
    public RectF rect;
    public boolean down;

    /**Constructeur */
    public Key(RectF rect, int sound)
    {
        this.sound=sound;
        this.rect=rect;
    }
}
