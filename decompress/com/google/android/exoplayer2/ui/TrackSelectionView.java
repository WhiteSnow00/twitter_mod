// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import android.widget.TextView;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseArray;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class TrackSelectionView extends LinearLayout
{
    public final CheckedTextView D0;
    public final CheckedTextView E0;
    public final SparseArray<ek8.e> F0;
    public boolean G0;
    public boolean H0;
    public dwt I0;
    public cwt J0;
    public boolean K0;
    
    public TrackSelectionView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.setOrientation(1);
        this.F0 = (SparseArray<ek8.e>)new SparseArray();
        ((View)this).setSaveFromParentEnabled(false);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 16843534 });
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        final LayoutInflater from = LayoutInflater.from(context);
        final a a = new a();
        this.I0 = (dwt)new zj8(((View)this).getResources());
        this.J0 = cwt.G0;
        final CheckedTextView d0 = (CheckedTextView)from.inflate(17367055, (ViewGroup)this, false);
        ((View)(this.D0 = d0)).setBackgroundResource(resourceId);
        ((TextView)d0).setText(2131953997);
        ((View)d0).setEnabled(false);
        ((View)d0).setFocusable(true);
        ((View)d0).setOnClickListener((View$OnClickListener)a);
        d0.setVisibility(8);
        ((ViewGroup)this).addView((View)d0);
        ((ViewGroup)this).addView(from.inflate(2131624441, (ViewGroup)this, false));
        final CheckedTextView e0 = (CheckedTextView)from.inflate(17367055, (ViewGroup)this, false);
        ((View)(this.E0 = e0)).setBackgroundResource(resourceId);
        ((TextView)e0).setText(2131953996);
        ((View)e0).setEnabled(false);
        ((View)e0).setFocusable(true);
        ((View)e0).setOnClickListener((View$OnClickListener)a);
        ((ViewGroup)this).addView((View)e0);
    }
    
    public final void a() {
        this.D0.setChecked(this.K0);
        this.E0.setChecked(!this.K0 && this.F0.size() == 0);
        throw null;
    }
    
    public final void b() {
        for (int i = ((ViewGroup)this).getChildCount() - 1; i >= 3; --i) {
            ((ViewGroup)this).removeViewAt(i);
        }
        ((View)this.D0).setEnabled(false);
        ((View)this.E0).setEnabled(false);
    }
    
    public boolean getIsDisabled() {
        return this.K0;
    }
    
    public List<ek8.e> getOverrides() {
        final ArrayList list = new ArrayList(this.F0.size());
        for (int i = 0; i < this.F0.size(); ++i) {
            list.add(this.F0.valueAt(i));
        }
        return list;
    }
    
    public void setAllowAdaptiveSelections(final boolean g0) {
        if (this.G0 != g0) {
            this.G0 = g0;
            this.b();
        }
    }
    
    public void setAllowMultipleOverrides(final boolean h0) {
        if (this.H0 != h0) {
            this.H0 = h0;
            if (!h0 && this.F0.size() > 1) {
                for (int i = this.F0.size() - 1; i > 0; --i) {
                    this.F0.remove(i);
                }
            }
            this.b();
        }
    }
    
    public void setShowDisableOption(final boolean b) {
        final CheckedTextView d0 = this.D0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        d0.setVisibility(visibility);
    }
    
    public void setTrackNameProvider(final dwt i0) {
        Objects.requireNonNull(i0);
        this.I0 = i0;
        this.b();
    }
    
    public final class a implements View$OnClickListener
    {
        public final TrackSelectionView D0;
        
        public a(final TrackSelectionView d0) {
            this.D0 = d0;
        }
        
        public final void onClick(final View view) {
            final TrackSelectionView d0 = this.D0;
            if (view == d0.D0) {
                d0.K0 = true;
                d0.F0.clear();
            }
            else {
                if (view != d0.E0) {
                    d0.K0 = false;
                    final Object tag = view.getTag();
                    Objects.requireNonNull(tag);
                    final ek8.e e = (ek8.e)d0.F0.get(((b)tag).a);
                    throw null;
                }
                d0.K0 = false;
                d0.F0.clear();
            }
            d0.a();
        }
    }
    
    public static final class b
    {
        public final int a;
    }
}
