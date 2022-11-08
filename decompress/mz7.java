import android.view.ViewGroup;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mz7 extends v3e<wx7$d, mz7.mz7$a>
{
    public final ah7 d;
    public final UserIdentifier e;
    public final rtb<wx7$d, oyv> f;
    
    public mz7(final Resources resources, final ah7 d, final UserIdentifier e, final rtb<? super wx7$d, oyv> f) {
        zzd.f((Object)resources, "res");
        zzd.f((Object)d, "dmCardViewFactory");
        zzd.f((Object)e, "currentUser");
        super((Class)wx7$d.class);
        this.d = d;
        this.e = e;
        this.f = (rtb<wx7$d, oyv>)f;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final mz7.mz7$a mz7$a = (mz7.mz7$a)c7x;
        final wx7$d wx7$d = (wx7$d)o;
        zzd.f((Object)mz7$a, "viewHolder");
        zzd.f((Object)wx7$d, "item");
        if (wx7$d instanceof wx7$d$b$a) {
            ((rz7<wx7$d>)mz7$a).l0(wx7$d, this.e, this.f);
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new mz7.mz7$a(viewGroup, this.d);
    }
}
