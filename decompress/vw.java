import android.content.Context;
import androidx.appcompat.app.e;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vw
{
    public final Activity a;
    public qmg b;
    public e c;
    
    public vw(final Activity a, final ibm ibm) {
        this.a = a;
        ibm.i((rj)new czo((Object)this, 19));
    }
    
    public final qmg a() {
        if (this.b == null) {
            this.b = new qmg((Context)this.a, 0);
        }
        return this.b;
    }
}
