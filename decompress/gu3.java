import android.view.View;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gu3<T extends bu3<?>> extends GestureDetector$SimpleOnGestureListener implements View$OnTouchListener
{
    public a C0;
    public int D0;
    public flc E0;
    public GestureDetector F0;
    public T G0;
    
    public gu3(final T g0) {
        this.C0 = a.C0;
        this.D0 = 0;
        this.G0 = g0;
        this.F0 = new GestureDetector(((View)g0).getContext(), (GestureDetector$OnGestureListener)this);
    }
    
    public enum a
    {
        C0, 
        D0, 
        E0, 
        F0, 
        G0, 
        H0, 
        I0, 
        J0, 
        K0;
    }
}
