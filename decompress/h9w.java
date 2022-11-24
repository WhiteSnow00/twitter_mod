import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.ui.user.UserApprovalView;

// 
// Decompiled by Procyon v0.6.0
// 

public class h9w extends b4e<icw, plw<UserApprovalView>>
{
    public final Context d;
    public final UserIdentifier e;
    public final a f;
    
    public h9w(final Context d, final UserIdentifier e, final a f) {
        super((Class)icw.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)plw.l0(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup, 2131625931);
    }
    
    public static class a
    {
        public final dew.b<UserApprovalView> a;
        public final dew.b<UserApprovalView> b;
        
        public a(final a.h9w$a$a h9w$a$a) {
            final dew.b a = h9w$a$a.a;
            vmw.g((Object)a);
            this.a = a;
            final dew.b b = h9w$a$a.b;
            vmw.g((Object)b);
            this.b = b;
        }
    }
}
