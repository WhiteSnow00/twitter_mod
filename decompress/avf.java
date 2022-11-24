import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avf implements rk6
{
    public static final avf G0;
    public static final avf H0;
    public static final avf I0;
    public static final avf J0;
    public static final avf K0;
    public static final avf L0;
    public static final avf M0;
    public static final avf N0;
    public static final avf O0;
    public final int F0;
    
    static {
        G0 = new avf(0);
        H0 = new avf(1);
        I0 = new avf(2);
        J0 = new avf(3);
        K0 = new avf(4);
        L0 = new avf(5);
        M0 = new avf(6);
        N0 = new avf(7);
        O0 = new avf(8);
    }
    
    public avf(final int f0) {
        this.F0 = f0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                final View view = (View)o;
                return;
            }
            case 7: {
                r9a.d((Throwable)o);
                return;
            }
            case 6: {
                j0i.a(3, 2, f0i.a(((dhj)o).F0));
                return;
            }
            case 5: {
                r9a.d((Throwable)o);
                return;
            }
            case 4: {
                r9a.d((Throwable)o);
                return;
            }
            case 3: {
                ((View)((b3u$a)o).a).setVisibility(8);
                return;
            }
            case 2: {
                r9a.d((Throwable)o);
                return;
            }
            case 1: {
                r9a.d((Throwable)o);
                return;
            }
            case 0: {
                r9a.d((Throwable)o);
            }
        }
    }
}
