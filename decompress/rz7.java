import java.util.Iterator;
import android.view.View$OnClickListener;
import java.util.List;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import com.twitter.dm.ui.DMAvatar;

// 
// Decompiled by Procyon v0.6.0
// 

public class rz7<T extends wx7$d> extends el8
{
    public final DMAvatar D0;
    public final TextView E0;
    public final TextView F0;
    public final TextView G0;
    public final Context H0;
    
    public rz7(final View view) {
        super(view);
        final View viewById = view.findViewById(2131432456);
        zzd.e((Object)viewById, "heldView.findViewById(R.id.user_avatar)");
        this.D0 = (DMAvatar)viewById;
        final View viewById2 = view.findViewById(2131432488);
        zzd.e((Object)viewById2, "heldView.findViewById(R.id.user_name)");
        this.E0 = (TextView)viewById2;
        final View viewById3 = view.findViewById(2131432507);
        zzd.e((Object)viewById3, "heldView.findViewById(R.id.user_text)");
        this.F0 = (TextView)viewById3;
        final View viewById4 = view.findViewById(2131432036);
        zzd.e((Object)viewById4, "heldView.findViewById(R.id.time_info)");
        this.G0 = (TextView)viewById4;
        this.H0 = view.getContext();
    }
    
    public final void l0(final T t, final UserIdentifier userIdentifier, final rtb<? super wx7$d, oyv> rtb) {
        zzd.f((Object)t, "item");
        zzd.f((Object)userIdentifier, "currentUser");
        zzd.f((Object)rtb, "conversationClickAction");
        final boolean b = t.j().c.C0 == userIdentifier.getId();
        final TextView e0 = this.E0;
        final lx7$b g = t.j().g;
        String text = null;
        Label_0201: {
            if (g != null) {
                text = g.g;
                if (text != null) {
                    break Label_0201;
                }
            }
            final List a = t.a();
            final ArrayList list = new ArrayList<zwj>(kr4.h1((Iterable)a, 10));
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(zwj.a((hfv)iterator.next()));
            }
            final long id = userIdentifier.getId();
            final Context h0 = this.H0;
            final lx7$b g2 = t.j().g;
            text = o48.c((List)list, Long.valueOf(id), h0, Boolean.valueOf(g2 != null && g2.i));
        }
        e0.setText((CharSequence)text);
        final lx7$b g3 = t.j().g;
        if (g3 != null && g3.i) {
            final lx7$b g4 = t.j().g;
            oyv a2 = null;
            moj a3 = null;
            Label_0282: {
                if (g4 != null) {
                    final ci1 h2 = g4.h;
                    if (h2 != null) {
                        a3 = h2.a();
                        break Label_0282;
                    }
                }
                a3 = null;
            }
            if (a3 != null) {
                this.D0.e(a3, this.E0.getText().toString());
                a2 = oyv.a;
            }
            if (a2 == null) {
                this.D0.setUsers(t.a());
            }
            this.F0.setText(t.i());
        }
        else if (b) {
            final List a4 = t.a();
            final ArrayList list2 = new ArrayList<zwj>(kr4.h1((Iterable)a4, 10));
            final Iterator iterator2 = a4.iterator();
            while (iterator2.hasNext()) {
                list2.add(zwj.a((hfv)iterator2.next()));
            }
            final List f = o48.f((List)list2, userIdentifier.getId());
            zzd.e((Object)f, "getParticipantUsersWitho\u2026User.id\n                )");
            Object value;
            if (tdy.S(f) >= 0) {
                value = f.get(0);
            }
            else {
                value = t.a().get(0);
            }
            this.D0.setUser((hfv)value);
            this.F0.setText(t.i());
        }
        else {
            this.D0.setUser(t.j().c);
            this.F0.setText(t.i());
        }
        final String q = hqs.q(super.C0.getResources(), t.j().d);
        zzd.e((Object)q, "getRelativeTimeString(he\u2026esources, item.timestamp)");
        this.G0.setText((CharSequence)this.H0.getString(2131953415, new Object[] { q }));
        super.C0.setOnClickListener((View$OnClickListener)new sy((Object)rtb, (Object)t, 5));
        p5x.z(super.C0, (wf)new rz7$a(this));
        this.m0(t, userIdentifier);
    }
    
    public void m0(final T t, final UserIdentifier userIdentifier) {
        zzd.f((Object)t, "item");
        zzd.f((Object)userIdentifier, "currentUser");
    }
}
