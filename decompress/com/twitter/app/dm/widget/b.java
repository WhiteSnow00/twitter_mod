// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.widget;

import android.view.MotionEvent;
import com.twitter.app.dm.DMConversationContentViewProvider;
import java.util.Locale;
import android.graphics.drawable.LayerDrawable;
import com.twitter.util.user.UserIdentifier;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import com.twitter.dm.widget.RecordingAudioView;
import android.widget.ImageButton;
import com.twitter.subsystem.composer.TweetBox;
import android.view.ViewGroup;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import com.twitter.subsystem.composer.TweetBox$f;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public abstract class b<L extends a> extends RelativeLayout implements View$OnClickListener, TweetBox$f, View$OnLongClickListener, View$OnTouchListener
{
    public knv D0;
    public final ViewGroup E0;
    public final ViewGroup F0;
    public final TweetBox G0;
    public final ImageButton H0;
    public final ImageButton I0;
    public final ImageButton J0;
    public final RecordingAudioView K0;
    public final View L0;
    public final ViewGroup M0;
    public final ImageView N0;
    public final Drawable O0;
    public L P0;
    public final Context Q0;
    
    public b(final Context q0, final AttributeSet set) {
        super(q0, set, 0);
        this.Q0 = q0;
        UserIdentifier.getCurrent().getId();
        View.inflate(q0, 2131624826, (ViewGroup)this);
        final ViewGroup e0 = (ViewGroup)((View)this).findViewById(2131428337);
        this.E0 = e0;
        this.F0 = (ViewGroup)((View)this).findViewById(2131429954);
        final TweetBox g0 = (TweetBox)((View)e0).findViewById(2131430048);
        (this.G0 = g0).setTweetBoxListener((TweetBox$f)this);
        g0.setMaxChars(-1);
        g0.setImeActionLabel(((View)this).getResources().getText(2131955810));
        g0.setOwnerInfo(zcw.d());
        g0.c();
        ((View)(this.H0 = (ImageButton)((View)e0).findViewById(2131431339))).setOnClickListener((View$OnClickListener)this);
        this.K0 = (RecordingAudioView)((View)e0).findViewById(2131430931);
        final ImageButton i0 = (ImageButton)((View)e0).findViewById(2131430919);
        ((View)(this.I0 = i0)).setOnClickListener((View$OnClickListener)this);
        pcx.v((View)i0, (View$OnLongClickListener)this);
        ((View)i0).setOnTouchListener((View$OnTouchListener)this);
        ((View)(this.J0 = (ImageButton)((View)e0).findViewById(2131431775))).setOnClickListener((View$OnClickListener)this);
        final View viewById = ((View)e0).findViewById(2131431864);
        this.L0 = viewById;
        this.M0 = (ViewGroup)viewById.findViewById(2131431860);
        this.N0 = (ImageView)viewById.findViewById(2131431865);
        Object o = viewById.findViewById(2131431862);
        final ImageButton imageButton = (ImageButton)viewById.findViewById(2131431859);
        this.O0 = ((LayerDrawable)viewById.getBackground()).findDrawableByLayerId(2131431863);
        while (((View)o).getParent() != null && ((View)o).getParent() instanceof ViewGroup) {
            o = ((View)o).getParent();
            ((ViewGroup)o).setClipChildren(false);
            ((ViewGroup)o).setClipToPadding(false);
        }
    }
    
    public final boolean b() {
        return false;
    }
    
    public final void e() {
        this.G0.p(false);
    }
    
    public abstract void f();
    
    public final void g(final Locale locale) {
    }
    
    public String getMessageText() {
        return this.G0.getText();
    }
    
    public final void h(final boolean b) {
    }
    
    public void i(final String s) {
        this.G0.k(s, (int[])null);
    }
    
    public final void j() {
        this.f();
        final knv d0 = this.D0;
        if (d0 != null) {
            final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)((eu4)d0).E0;
            final nnl k2 = dmConversationContentViewProvider.k2;
            if (k2 != null) {
                k2.onNext((Object)dmConversationContentViewProvider.e1);
            }
        }
    }
    
    public void l() {
        this.P0.d(this.getMessageText().trim());
    }
    
    public final void o() {
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131431339) {
            final String text = this.G0.getText();
            if (text.startsWith("/shrug")) {
                this.P0.d(text.replaceFirst("/shrug", "¯\\\\_(\u30c4)_/¯").trim());
            }
            else {
                this.P0.d(text.trim());
            }
        }
    }
    
    public final boolean onLongClick(final View view) {
        return false;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    public void setListener(final L p) {
        this.P0 = p;
    }
    
    public void setQuotedTweet(final vvl quote) {
        this.G0.setQuote(quote);
    }
    
    public void setTypingEventProducer(final knv d0) {
        this.D0 = d0;
    }
    
    public final void z() {
        this.f();
    }
    
    public interface a
    {
        void d(final String p0);
    }
}
