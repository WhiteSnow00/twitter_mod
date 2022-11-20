import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.ui.user.UserApprovalView;

// 
// Decompiled by Procyon v0.6.0
// 

public class r8w extends a3e<sbw, xkw<UserApprovalView>>
{
    public final Context d;
    public final UserIdentifier e;
    public final a f;
    
    public r8w(final Context d, final UserIdentifier e, final a f) {
        super((Class)sbw.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        return (v7x)xkw.l0(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup, 2131625931);
    }
    
    public static class a
    {
        public final odw$b<UserApprovalView> a;
        public final odw$b<UserApprovalView> b;
        
        public a(final a.r8w$a$a r8w$a$a) {
            final odw$b a = r8w$a$a.a;
            jee.l((Object)a);
            this.a = (odw$b<UserApprovalView>)a;
            final odw$b b = r8w$a$a.b;
            jee.l((Object)b);
            this.b = (odw$b<UserApprovalView>)b;
        }
    }
}
