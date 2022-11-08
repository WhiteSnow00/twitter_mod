import android.view.LayoutInflater;
import java.io.PrintWriter;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lob<E> extends fb
{
    public final Activity D0;
    public final Context E0;
    public final Handler F0;
    public final apb G0;
    
    public lob(final gob gob) {
        final Handler f0 = new Handler();
        this.G0 = new apb();
        ri4.r((Object)(this.D0 = (Activity)gob), (Object)"context == null");
        this.E0 = (Context)gob;
        this.F0 = f0;
    }
    
    public abstract void t0(final PrintWriter p0, final String[] p1);
    
    public abstract E u0();
    
    public abstract LayoutInflater v0();
    
    public abstract void w0();
}
