import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qz9 implements DialogInterface$OnClickListener
{
    public final int F0;
    public final Object G0;
    
    public qz9(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int r2) {
        switch (this.F0) {
            default: {
                final iyr iyr = (iyr)this.G0;
                e0e.f((Object)iyr, "this$0");
                final Activity i0 = iyr.I0;
                final Uri parse = Uri.parse("https://help.twitter.com/en/using-twitter/super-follows-help");
                e0e.e((Object)parse, "parse(HELP_URL)");
                p70.p((Context)i0, parse);
                return;
            }
            case 2: {
                final e5o e5o = (e5o)this.G0;
                final e5o$a companion = e5o.Companion;
                e0e.f((Object)e5o, "this$0");
                e5o.e.onNext((Object)kni.a);
                return;
            }
            case 1: {
                final yy9 yy9 = (yy9)this.G0;
                r2 = yy9.r2;
                ((tw8)yy9).Z1(false, false);
                return;
            }
            case 0: {
                final qpg qpg = (qpg)this.G0;
                e0e.f((Object)qpg, "$emitter");
                ((hpg$a)qpg).a();
            }
        }
    }
}
