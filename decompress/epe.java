import android.app.Dialog;
import java.util.concurrent.Callable;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.LinkedHashSet;
import android.widget.TextView;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Objects;
import android.graphics.PointF;
import java.util.List;
import java.util.Set;
import tv.periscope.android.ui.broadcast.WatchersView;
import android.graphics.drawable.Drawable;
import tv.periscope.android.ui.broadcast.BottomTray;
import java.util.Vector;
import java.util.HashMap;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epe implements u80, ycm, gry, g000, hlb, ka2
{
    public final int D0;
    public Object E0;
    
    public epe(final int d0) {
        this.D0 = d0;
        if (d0 == 11) {
            this.E0 = new HashSet();
            return;
        }
        if (d0 != 14) {
            this.E0 = new HashMap();
            return;
        }
        this.E0 = new Vector();
    }
    
    public epe(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public epe(final nza e0) {
        this.D0 = 10;
        this.E0 = e0;
    }
    
    public final void A(final int hydraCallInVisibility) {
        ((BottomTray)this.E0).setHydraCallInVisibility(hydraCallInVisibility);
    }
    
    public final void B(final int chatStatusText) {
        ((BottomTray)this.E0).setChatStatusText(chatStatusText);
    }
    
    public final void C(final String avatarImage) {
        ((BottomTray)this.E0).setAvatarImage(avatarImage);
    }
    
    public final int D() {
        return ((BottomTray)this.E0).getComposeTextLength();
    }
    
    public final void E() {
        ((BottomTray)this.E0).setChatStatusVisibility(0);
    }
    
    public final void F() {
        ((BottomTray)this.E0).setComposeTextString((CharSequence)"");
    }
    
    public final void G(final chj listener) {
        ((BottomTray)this.E0).setListener(listener);
    }
    
    public final void H(final CharSequence superHeartCountText) {
        ((BottomTray)this.E0).setSuperHeartCountText(superHeartCountText);
    }
    
    public final void I() {
        ((View)((BottomTray)this.E0).N0).clearFocus();
    }
    
    public final void J(final int superHeartShortcutVisibility) {
        ((BottomTray)this.E0).setSuperHeartShortcutVisibility(superHeartShortcutVisibility);
    }
    
    public final void K() {
        ((BottomTray)this.E0).setFriendsWatchingVisibility(0);
    }
    
    public final void L() {
        ((View)((BottomTray)this.E0).X0).setVisibility(0);
    }
    
    public final void M(final int text, final int text2) {
        final BottomTray bottomTray = (BottomTray)this.E0;
        if (text == 0) {
            ((View)bottomTray.S0).setVisibility(8);
        }
        else {
            ((View)bottomTray.S0).setVisibility(0);
            bottomTray.S0.setText(text);
        }
        bottomTray.T0.setText(text2);
        ((Dialog)bottomTray.R0).show();
    }
    
    public final void N(final int closeButtonVisibility) {
        ((BottomTray)this.E0).setCloseButtonVisibility(closeButtonVisibility);
    }
    
    public final void O(final Drawable drawable) {
        ((BottomTray)this.E0).Q0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    public final void P(final int avatarColorFilter) {
        ((BottomTray)this.E0).setAvatarColorFilter(avatarColorFilter);
    }
    
    public final void Q() {
        ((View)((BottomTray)this.E0).Z0).setVisibility(8);
    }
    
    public final void R(final int chatStatusCompoundDrawablePadding) {
        ((BottomTray)this.E0).setChatStatusCompoundDrawablePadding(chatStatusCompoundDrawablePadding);
    }
    
    public final void S() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        if (bottomTray.o1 == null) {
            bottomTray.o1 = (WatchersView)bottomTray.O0.inflate().findViewById(2131432639);
            return;
        }
        throw new IllegalStateException("Avatar view position has already been set");
    }
    
    public final void T() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        bottomTray.K0.setImageResource(2131233028);
        ((View)bottomTray.K0).setContentDescription((CharSequence)((View)bottomTray).getResources().getString(2131956054));
    }
    
    public final int U(final String s) {
        if (s != null && ((Set)this.E0).contains(s.trim())) {
            return 2;
        }
        return 0;
    }
    
    @Override
    public final rm1 V() {
        if (((List)this.E0).get(0).c()) {
            return new yok((List<dre<PointF>>)this.E0);
        }
        return (rm1)new szj((List)this.E0);
    }
    
    public final void W(final int superHeartCountVisibility) {
        ((BottomTray)this.E0).setSuperHeartCountVisibility(superHeartCountVisibility);
    }
    
    public final void X(final m8d imageLoader) {
        ((BottomTray)this.E0).setImageLoader(imageLoader);
    }
    
    @Override
    public final List Y() {
        return (List)this.E0;
    }
    
    public final void Z() {
        ((BottomTray)this.E0).b();
    }
    
    @Override
    public final /* bridge */ Object a() {
        return new hiy(((ahz)this.E0).b());
    }
    
    @Override
    public final void a() {
        final x000 x000 = (x000)this.E0;
        Objects.requireNonNull(x000);
        x000.a("split-install-errors", (g000)new sek((Object)x000));
    }
    
    public final void a0(final i i) {
        ((Vector)this.E0).addElement(i);
    }
    
    @Override
    public final void accept(Object obtain, final Object o) {
        switch (this.D0) {
            case 3: {
                final zsy zsy = (zsy)obtain;
                final zbs zbs = (zbs)o;
                final v6z v6z = (v6z)((bm1)zsy).D();
                final x8y x8y = new x8y(null, null);
                final ltz ltz = new ltz(zbs);
                obtain = Parcel.obtain();
                ((Parcel)obtain).writeInterfaceToken(v6z.b);
                final int a = doy.a;
                ((Parcel)obtain).writeInt(1);
                x8y.writeToParcel((Parcel)obtain, 0);
                ((Parcel)obtain).writeStrongBinder((IBinder)ltz);
                final Parcel obtain2 = Parcel.obtain();
                try {
                    v6z.a.transact(1, (Parcel)obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                }
                finally {
                    ((Parcel)obtain).recycle();
                    obtain2.recycle();
                }
                break;
            }
        }
        final g6y g6y = (g6y)this.E0;
        final h6y h6y = (h6y)obtain;
        final zbs zbs2 = (zbs)o;
        Objects.requireNonNull(g6y);
        final f6y f6y = new f6y(zbs2);
        final z5y z5y = (z5y)((bm1)h6y).D();
        final String k = g6y.k;
        final Parcel s = ((w5y)z5y).s();
        t6y.c(s, (IInterface)f6y);
        s.writeString(k);
        ((w5y)z5y).x(2, s);
    }
    
    public final void b() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        final wit q1 = bottomTray.q1;
        if (q1 != null) {
            q1.a();
        }
        bottomTray.W0.setVisibility(8);
        bottomTray.H0.setVisibility(8);
        bottomTray.E0.setVisibility(8);
        bottomTray.b1.setVisibility(8);
        bottomTray.J0.setVisibility(8);
        bottomTray.K0.setVisibility(8);
        ((View)bottomTray.Q0).setVisibility(8);
        bottomTray.V0.setVisibility(8);
        bottomTray.M0.setVisibility(8);
        bottomTray.L0.setVisibility(8);
        bottomTray.setFriendsWatchingVisibility(8);
        bottomTray.P0.a.setVisibility(8);
        ((View)bottomTray.X0).setVisibility(8);
        bottomTray.Y0.setVisibility(8);
    }
    
    public final void b0(final TextView textView, final tes tes) {
        if (textView != null) {
            final int n = 0;
            int visibility;
            if (tes instanceof t2a) {
                visibility = 8;
            }
            else if (tes instanceof dkr) {
                final int a = c5j.a;
                textView.setText(((dkr)tes).b);
                visibility = n;
            }
            else if (tes instanceof hkr) {
                final int a2 = c5j.a;
                textView.setText((CharSequence)((hkr)tes).b);
                visibility = n;
            }
            else if (tes instanceof qxm) {
                final int a3 = c5j.a;
                final qxm qxm = (qxm)tes;
                final id6 id6 = (id6)this.E0;
                final oxm b = qxm.b;
                Objects.requireNonNull(id6);
                bym$a.a(textView, b, (bym)id6);
                visibility = n;
            }
            else {
                visibility = n;
                if (tes instanceof q0r) {
                    final int a4 = c5j.a;
                    textView.setText((CharSequence)t60.a(((q0r)tes).b));
                    visibility = n;
                }
            }
            ((View)textView).setVisibility(visibility);
        }
    }
    
    public final void c(final Drawable selectedGift) {
        ((BottomTray)this.E0).setSelectedGift(selectedGift);
    }
    
    public final cpx c0(final ve4 ve4) {
        czd.f((Object)ve4, "allowlist");
        Objects.requireNonNull(cpx.Companion);
        final cpx cpx = new cpx();
        final nza nza = (nza)this.E0;
        Objects.requireNonNull(nza);
        if (((Enum)ve4.G0).ordinal() == 0) {
            final HashMap d0 = ve4.D0;
            czd.e((Object)d0, "root");
            final LinkedHashSet set = new LinkedHashSet();
            final Iterator iterator = d0.entrySet().iterator();
            while (iterator.hasNext()) {
                kq4.N((Collection)set, (Iterable)nza.a1((Map.Entry)iterator.next(), (List)f2a.D0));
            }
            for (final List list : set) {
                czd.f((Object)list, "tokens");
                final dpx a = cpx.a;
                Objects.requireNonNull(a);
                a.a((List)list, 0);
            }
            return cpx;
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    public final void d(final Drawable chatStatusBackground) {
        ((BottomTray)this.E0).setChatStatusBackground(chatStatusBackground);
    }
    
    public final i d0(final int n) {
        return ((Vector)this.E0).elementAt(n);
    }
    
    public final void e(final int hydraInviteVisibility) {
        ((BottomTray)this.E0).setHydraInviteVisibility(hydraInviteVisibility);
    }
    
    public final h5j e0() {
        return ((BottomTray)this.E0).getCloseButtonClickObservable();
    }
    
    @Override
    public final boolean f() {
        final int size = ((List)this.E0).size();
        boolean b = false;
        if (size == 1) {
            b = b;
            if (((List)this.E0).get(0).c()) {
                b = true;
            }
        }
        return b;
    }
    
    public final h5j f0() {
        return ((BottomTray)this.E0).getComposeTextChangeObservable();
    }
    
    public final void g() {
        are.c((View)((BottomTray)this.E0).N0);
    }
    
    public final h5j g0() {
        return ((BottomTray)this.E0).getComposeTextFocusChangeObservable();
    }
    
    public final void h() {
        are.d((View)((BottomTray)this.E0).N0);
    }
    
    public final h5j h0() {
        return ((BottomTray)this.E0).getEventObservable();
    }
    
    public final void i() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        final AnimationDrawable imageDrawable = (AnimationDrawable)((View)bottomTray).getResources().getDrawable(2131233006);
        bottomTray.a1.setImageDrawable((Drawable)imageDrawable);
        imageDrawable.start();
    }
    
    public final float i0(final Object o, final String s) {
        if (!((HashMap)this.E0).containsKey(o)) {
            return Float.NaN;
        }
        final HashMap hashMap = ((HashMap)this.E0).get(o);
        if (hashMap != null) {
            if (hashMap.containsKey(s)) {
                final float[] array = (float[])hashMap.get(s);
                if (array == null) {
                    return Float.NaN;
                }
                if (array.length > 0) {
                    return array[0];
                }
            }
        }
        return Float.NaN;
    }
    
    public final void j(final int shareShortcutVisibility) {
        ((BottomTray)this.E0).setShareShortcutVisibility(shareShortcutVisibility);
    }
    
    public final h5j j0() {
        return ((BottomTray)this.E0).getHydraCallInClickObservable();
    }
    
    public final void k(final CharSequence chatStatusText) {
        ((BottomTray)this.E0).setChatStatusText(chatStatusText);
    }
    
    public final h5j k0() {
        return ((BottomTray)this.E0).getHydraInviteClickObservable();
    }
    
    public final h5j l() {
        return ((BottomTray)this.E0).getChatStatusClickObservable();
    }
    
    public final h5j l0() {
        return ((BottomTray)this.E0).getOverflowClickObservable();
    }
    
    public final void m() {
        ((BottomTray)this.E0).a1.setImageResource(2131232994);
    }
    
    public final h5j m0() {
        return ((BottomTray)this.E0).getSendIconClickObservable();
    }
    
    public final void n() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        if (((Dialog)bottomTray.R0).isShowing()) {
            ((ck0)bottomTray.R0).dismiss();
        }
    }
    
    public final h5j n0() {
        return ((BottomTray)this.E0).getShareShortcutClickObservable();
    }
    
    public final void o() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        bottomTray.K0.setImageResource(2131233031);
        ((View)bottomTray.K0).setContentDescription((CharSequence)((View)bottomTray).getResources().getString(2131956055));
    }
    
    public final h5j o0() {
        return ((BottomTray)this.E0).getSkipToLiveClickObservable();
    }
    
    public final void p() {
        ((View)((BottomTray)this.E0).Z0).setVisibility(0);
    }
    
    public final h5j p0() {
        return ((BottomTray)this.E0).getSuperHeartShortcutClickObservable();
    }
    
    public final void q() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)bottomTray.Q0, View.ALPHA, new float[] { 0.0f, 1.0f });
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)bottomTray.V0, View.ALPHA, new float[] { 1.0f, 0.0f });
        final AnimatorSet set = new AnimatorSet();
        set.play((Animator)ofFloat).with((Animator)ofFloat2);
        ((Animator)set).addListener((Animator$AnimatorListener)new r92(bottomTray));
        set.start();
    }
    
    public final sy5 q0(final Callable callable) {
        return ((sy5)new fz5(callable)).t((gwo)this.E0);
    }
    
    public final void r(final int sendIconVisibility) {
        ((BottomTray)this.E0).setSendIconVisibility(sendIconVisibility);
    }
    
    public final int r0() {
        return ((Vector)this.E0).size();
    }
    
    public final void s(final CharSequence charSequence) {
        ((TextView)((BottomTray)this.E0).N0).append(charSequence);
    }
    
    public final String t() {
        return ((BottomTray)this.E0).getComposeTextString();
    }
    
    public final void u() {
        final BottomTray bottomTray = (BottomTray)this.E0;
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)bottomTray.Q0, View.ALPHA, new float[] { 1.0f, 0.0f });
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)bottomTray.V0, View.ALPHA, new float[] { 0.0f, 1.0f });
        final AnimatorSet set = new AnimatorSet();
        set.play((Animator)ofFloat).with((Animator)ofFloat2);
        ((Animator)set).addListener((Animator$AnimatorListener)new q92(bottomTray));
        set.start();
    }
    
    public final void v(final int hydraCallInCounter) {
        ((BottomTray)this.E0).setHydraCallInCounter(hydraCallInCounter);
    }
    
    public final WatchersView w() {
        return ((BottomTray)this.E0).getWatchersView();
    }
    
    public final void x() {
        ((BottomTray)this.E0).setPlayPauseButtonVisibility(0);
    }
    
    public final void y() {
        ((BottomTray)this.E0).setOverflowVisibility(0);
    }
    
    public final void z(final int horizontalBarVisibility) {
        ((BottomTray)this.E0).setHorizontalBarVisibility(horizontalBarVisibility);
    }
}
