import android.widget.TextView;
import com.twitter.dm.ui.DMAvatar;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qx7 extends v3e<wx7$a, a>
{
    public final Resources d;
    public final rtb<wx7$a, oyv> e;
    public final rtb<wx7$a, oyv> f;
    
    public qx7(final Resources d, final UserIdentifier userIdentifier, final rtb<? super wx7$a, oyv> e, final rtb<? super wx7$a, oyv> f) {
        zzd.f((Object)d, "res");
        zzd.f((Object)userIdentifier, "currentUser");
        super((Class)wx7$a.class);
        this.d = d;
        this.e = (rtb<wx7$a, oyv>)e;
        this.f = (rtb<wx7$a, oyv>)f;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final wx7$a wx7$a = (wx7$a)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)wx7$a, "item");
        CharSequence text = wx7$a.b();
        if (text.length() == 0) {
            text = this.d.getString(2131953401);
            zzd.e((Object)text, "res.getString(com.twitte\u2026ng.dm_search_group_title)");
        }
        a.E0.setText(text);
        a.F0.setText((CharSequence)this.d.getString(2131953400, new Object[] { wx7$a.a().size() }));
        final moj j = wx7$a.J();
        oyv a2;
        if (j != null) {
            a.D0.e(j, text.toString());
            a2 = oyv.a;
        }
        else {
            a2 = null;
        }
        if (a2 == null) {
            a.D0.setUsers(wx7$a.a());
        }
        ((View)a.D0).setContentDescription((CharSequence)this.d.getString(2131953399, new Object[] { text }));
        p5x.z((View)a.D0, (wf)new rx7(this));
        a.G0.setText(wx7$a.d());
        a.C0.setOnClickListener((View$OnClickListener)new hpa(this, wx7$a, 4));
        ((View)a.D0).setOnClickListener((View$OnClickListener)new gpa(this, wx7$a, 4));
        p5x.z(a.C0, (wf)new sx7(this));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new a(viewGroup);
    }
    
    public static final class a extends el8
    {
        public final DMAvatar D0;
        public final TextView E0;
        public final TextView F0;
        public final TextView G0;
        
        public a(final ViewGroup viewGroup) {
            final View v = lf.v(viewGroup, "parent", 2131624349, viewGroup, false);
            super(v);
            final View viewById = v.findViewById(2131427735);
            zzd.e((Object)viewById, "heldView.findViewById(R.id.avatar)");
            this.D0 = (DMAvatar)viewById;
            final View viewById2 = v.findViewById(2131428706);
            zzd.e((Object)viewById2, "heldView.findViewById(R.id.display_name)");
            this.E0 = (TextView)viewById2;
            final View viewById3 = v.findViewById(2131429363);
            zzd.e((Object)viewById3, "heldView.findViewById(R.id.group_info)");
            this.F0 = (TextView)viewById3;
            final View viewById4 = v.findViewById(2131430520);
            zzd.e((Object)viewById4, "heldView.findViewById(R.id.participants)");
            this.G0 = (TextView)viewById4;
        }
    }
}
