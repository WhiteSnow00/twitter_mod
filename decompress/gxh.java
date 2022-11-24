import com.twitter.app.safety.mutedkeywords.composer.c;
import android.content.DialogInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxh implements cx8
{
    public final int F0;
    public final Object G0;
    
    public gxh(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
        switch (this.F0) {
            default: {
                final jdq jdq = (jdq)this.G0;
                e0e.f((Object)jdq, "$subject");
                e0e.f((Object)dialogInterface, "<anonymous parameter 0>");
                jdq.b((Object)ox8$a.a);
                return;
            }
            case 0: {
                ((c)this.G0).d1.e = 0;
            }
        }
    }
}
