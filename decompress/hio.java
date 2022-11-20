import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import androidx.cardview.widget.CardView;
import android.graphics.drawable.Drawable;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.twitter.rooms.manager.RoomStateManager;
import android.view.View;
import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hio extends a3e<RoomUserItem, vio>
{
    public final ul1 d;
    public final u0n e;
    public final rwn f;
    public final mjo g;
    public final vjo h;
    public final nnl<lvj<View, Long>> i;
    public final nnl<lvj<View, Long>> j;
    public final ftn k;
    public final n4s l;
    public float m;
    
    public hio(final ul1 d, final u0n e, final rwn f, final mjo g, final vjo h, final nnl<lvj<View, Long>> i, final nnl<lvj<View, Long>> j, final ftn k, final RoomStateManager roomStateManager, final xbm xbm) {
        czd.f((Object)e, "roomReactionReceivedDispatcher");
        czd.f((Object)f, "roomReceivedRaisedHandEventDispatcher");
        czd.f((Object)g, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)h, "roomsScribeReporter");
        czd.f((Object)i, "nuxAvatarTooltipSubject");
        czd.f((Object)j, "nuxListenerTooltipSubject");
        czd.f((Object)k, "roomNuxTooltipController");
        czd.f((Object)roomStateManager, "roomStateManager");
        czd.f((Object)xbm, "releaseCompletable");
        super((Class)RoomUserItem.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = (n4s)pps.n((nsb)new hio$c(this));
        xbm.i((oj)new ai7(roomStateManager.D0((foe)hio$a.D0, new foe[0]).subscribe((lj6)new cpl((qsb)new hio$b(this), 6)), 7));
        this.m = (float)(d.getResources().getDimensionPixelOffset(2131165321) / 3);
    }
    
    public final void k(final v7x v7x, Object o, final xbm xbm) {
        final vio vio = (vio)v7x;
        final RoomUserItem x0 = (RoomUserItem)o;
        czd.f((Object)vio, "viewHolder");
        czd.f((Object)x0, "item");
        final wc6 wc6 = new wc6();
        wc6.d(new t19[] { ((h5j)this.i).filter((ytk)new en0((qsb)new qio(vio, x0), 15)).subscribe((lj6)new r58((qsb)new rio(this, vio), 29)), ((h5j)this.j).filter((ytk)new ht1((qsb)new oio(vio, x0), 18)).subscribe((lj6)new fwi((qsb)new pio(this, vio), 9)) });
        xbm.i((oj)new gkf(wc6, 9));
        final RoomUserItem x2 = vio.X0;
        final wio wio = null;
        String twitterUserId;
        if (x2 != null) {
            twitterUserId = x2.getTwitterUserId();
        }
        else {
            twitterUserId = null;
        }
        if (!czd.a((Object)twitterUserId, (Object)x0.getTwitterUserId())) {
            ((View)vio.f1).animate().cancel();
            vio.f1.setVisibility(4);
            vio.Y0.c(((h5j)this.e.a).filter((ytk)new oyf((qsb)iio.D0, 15)).subscribe((lj6)new ayi((qsb)new kio(x0, vio), 5)));
            vio.Z0.c(((h5j)this.f.a).subscribe((lj6)new irl((qsb)new mio(x0, vio, this), 5)));
            ((TextView)vio.a1).setText((CharSequence)x0.getName());
            int n;
            if (!x0.isVerified() && !x0.isTwitterBlueVerified()) {
                n = 8;
            }
            else {
                n = 0;
            }
            vio.h1.k(n);
            final edq$a companion = edq.Companion;
            final int dimensionPixelSize = ((View)vio.c1).getContext().getResources().getDimensionPixelSize(2131165321);
            vio.c1.J(new soj(x0.getImageUrl(), companion.b(dimensionPixelSize, dimensionPixelSize)));
        }
        xli.w0(vio.c1, ii8.B(x0));
        final String emoji = x0.getRaisedHand().getEmoji();
        t0a$a e;
        if (emoji != null) {
            e = t0a.e(emoji, djo.h());
        }
        else {
            e = null;
        }
        if (e != null) {
            final v2c j1 = vio.j1;
            final int a = e.a;
            czd.f((Object)j1, "<this>");
            final View g = j1.g();
            final ImageView imageView = (ImageView)((View)g).findViewById(2131431145);
            final Context context = ((View)j1.g()).getContext();
            final Object a2 = kn6.a;
            imageView.setImageDrawable(kn6.c.b(context, a));
            czd.e((Object)g, "visibleView.apply {\n    \u2026xt, emojiResource))\n    }");
            g.animate().scaleX(0.65f).scaleY(0.65f).translationX(this.m).translationY(-this.m).setDuration(0L).start();
        }
        else {
            vio.j1.k(4);
        }
        final t19 subscribe = aoo.f((View)vio.c1).subscribe((lj6)new gwi((qsb)new nio(this, x0), 11));
        final boolean b = x0.getCommunityRole() != null && !czd.a((Object)x0.getCommunityRole(), (Object)AudioSpaceCommunityRoleType.NonMember.INSTANCE);
        final v2c g2 = vio.g1;
        int n2;
        if (b) {
            n2 = 0;
        }
        else {
            n2 = 8;
        }
        g2.k(n2);
        if (b) {
            final Drawable imageDrawable = (Drawable)this.l.getValue();
            if (imageDrawable != null) {
                final v2c g3 = vio.g1;
                czd.f((Object)g3, "<this>");
                final View g4 = g3.g();
                ((ImageView)((View)g4).findViewById(2131431578)).setImageDrawable(imageDrawable);
                czd.e((Object)g4, "visibleView.apply {\n    \u2026eDrawable(drawable)\n    }");
            }
        }
        xbm.i((oj)new nv7(vio, subscribe));
        final int ordinal = ((Enum)x0.getUserStatus()).ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 3) {
                ((View)vio.d1).setVisibility(8);
                ((IsTalkingView)vio.e1.f()).e();
                ((ImageView)vio.i1.f()).setVisibility(8);
            }
            else {
                ((View)vio.d1).setVisibility(0);
                ((IsTalkingView)vio.e1.f()).e();
                ((ImageView)vio.i1.f()).setVisibility(8);
            }
        }
        else {
            if (x0.isTalking()) {
                ((ImageView)vio.i1.f()).setVisibility(8);
                ((IsTalkingView)vio.e1.f()).c();
            }
            else if (vio.e1.i()) {
                ((IsTalkingView)vio.e1.f()).e();
                ((View)vio.e1.f()).setVisibility(4);
                if (czd.a((Object)x0.isLocallyMuted(), (Object)Boolean.TRUE)) {
                    ((ImageView)vio.i1.f()).setVisibility(0);
                }
            }
            else {
                final Boolean locallyMuted = x0.isLocallyMuted();
                final Boolean true = Boolean.TRUE;
                if (czd.a((Object)locallyMuted, (Object)true) && !x0.isTalking() && !x0.isPendingCohost()) {
                    ((ImageView)vio.i1.f()).setVisibility(0);
                }
                else if (!czd.a((Object)x0.isLocallyMuted(), (Object)true)) {
                    ((ImageView)vio.i1.f()).setVisibility(8);
                }
            }
            ((View)vio.d1).setVisibility(8);
        }
        Label_1366: {
            if (czd.a((Object)x0.isBlocked(), (Object)Boolean.TRUE)) {
                ((TextView)vio.b1).setText((CharSequence)vio.D0.getContext().getString(2131952216));
                final TypefacesTextView b2 = vio.b1;
                ((TextView)b2).setTextColor(kn6.b(((View)b2).getContext(), 2131099845));
            }
            else {
                final Boolean blocked = x0.isBlocked();
                final RoomUserItem x3 = vio.X0;
                Boolean blocked2;
                if (x3 != null) {
                    blocked2 = x3.isBlocked();
                }
                else {
                    blocked2 = null;
                }
                if (czd.a((Object)blocked, (Object)blocked2)) {
                    final wio userStatus = x0.getUserStatus();
                    final RoomUserItem x4 = vio.X0;
                    wio userStatus2 = wio;
                    if (x4 != null) {
                        userStatus2 = x4.getUserStatus();
                    }
                    if (userStatus == userStatus2) {
                        break Label_1366;
                    }
                }
                final TypefacesTextView b3 = vio.b1;
                final Context context2 = vio.D0.getContext();
                final int ordinal2 = ((Enum)x0.getUserStatus()).ordinal();
                int n3 = 2131959446;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            else {
                                n3 = 2131959447;
                            }
                        }
                        else {
                            n3 = 2131959444;
                        }
                    }
                    else if (!x0.isPendingCohost()) {
                        n3 = 2131959448;
                    }
                }
                else if (x0.isPrimaryAdmin()) {
                    n3 = 2131959442;
                }
                else {
                    n3 = 2131959443;
                }
                ((TextView)b3).setText((CharSequence)context2.getString(n3));
                final TypefacesTextView b4 = vio.b1;
                final Context context3 = ((View)b4).getContext();
                czd.e((Object)context3, "status.context");
                ((TextView)b4).setTextColor(d4j.i(context3, 2130969093));
            }
        }
        vio.X0 = x0;
        final Context context4 = vio.D0.getContext();
        o = new StringBuilder();
        ((StringBuilder)o).append(((AppCompatTextView)vio.a1).getText());
        if (vio.h1.i()) {
            tkr.L((StringBuilder)o, new String[] { ", ", context4.getString(2131954376) });
        }
        final View f = vio.i1.f();
        czd.e((Object)f, "mutedSpeakerIcon.view");
        if (f.getVisibility() == 0) {
            tkr.K((StringBuilder)o, new Object[] { ", ", ((View)vio.i1.f()).getContentDescription() });
        }
        final View f2 = vio.e1.f();
        czd.e((Object)f2, "isTalkingIndicator.view");
        if (f2.getVisibility() == 0) {
            tkr.K((StringBuilder)o, new Object[] { ", ", ((View)vio.e1.f()).getContentDescription() });
        }
        tkr.K((StringBuilder)o, new Object[] { ", ", ((AppCompatTextView)vio.b1).getText() });
        if (vio.j1.i()) {
            tkr.L((StringBuilder)o, new String[] { ", ", context4.getString(2131958274) });
        }
        vio.D0.setContentDescription((CharSequence)((StringBuilder)o).toString());
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131625582, viewGroup, false);
        czd.e((Object)e, "view");
        return (v7x)new vio(e);
    }
}
