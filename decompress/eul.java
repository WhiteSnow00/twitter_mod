import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eul extends ste implements itb<Dialog, Integer, Integer, fzv>
{
    public final dul D0;
    public final pul$a$a E0;
    
    public eul(final dul d0, final pul$a$a e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final Dialog dialog = (Dialog)o;
        ((Number)o2).intValue();
        final int intValue = ((Number)o3).intValue();
        czd.f((Object)dialog, "<anonymous parameter 0>");
        if (intValue == -1) {
            this.D0.N0.onNext((Object)new utl$b$a(this.E0.b));
        }
        this.D0.a();
        return fzv.a;
    }
}
