import android.os.Looper;
import java.util.ArrayList;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class em8 extends dm8
{
    public final Object b;
    public final Handler c;
    public ArrayList<dm8$a> d;
    public ArrayList<dm8$a> e;
    public final em8$a f;
    
    public em8() {
        this.b = new Object();
        this.f = new em8$a(this);
        this.d = new ArrayList<dm8$a>();
        this.e = new ArrayList<dm8$a>();
        this.c = new Handler(Looper.getMainLooper());
    }
    
    public final void a(final dm8$a dm8$a) {
        synchronized (this.b) {
            this.d.remove(dm8$a);
        }
    }
}
