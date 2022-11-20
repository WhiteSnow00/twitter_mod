import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sua implements DialogInterface$OnClickListener
{
    public static final sua E0;
    public static final sua F0;
    public static final sua G0;
    public final int D0;
    
    static {
        E0 = new sua(0);
        F0 = new sua(1);
        G0 = new sua(2);
    }
    
    public sua(final int d0) {
        this.D0 = d0;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        switch (this.D0) {
            default: {
                return;
            }
            case 0: {
                dialogInterface.dismiss();
            }
        }
    }
}
