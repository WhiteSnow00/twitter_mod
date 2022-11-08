// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.view.View;

public class a
{
    public static RectF a(final TabLayout tabLayout, final View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.d1 && view instanceof TabLayout.i) {
            final TabLayout.i i = (TabLayout.i)view;
            final int contentWidth = i.getContentWidth();
            final int contentHeight = i.getContentHeight();
            final int n = (int)sbx.a(((View)i).getContext(), 24);
            int n2;
            if ((n2 = contentWidth) < n) {
                n2 = n;
            }
            final int n3 = (((View)i).getRight() + ((View)i).getLeft()) / 2;
            final int n4 = (((View)i).getBottom() + ((View)i).getTop()) / 2;
            final int n5 = n2 / 2;
            return new RectF((float)(n3 - n5), (float)(n4 - contentHeight / 2), (float)(n5 + n3), (float)(n3 / 2 + n4));
        }
        return new RectF((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
    }
    
    public void b(final TabLayout tabLayout, final View view, final View view2, final float n, final Drawable drawable) {
        final RectF a = a(tabLayout, view);
        final RectF a2 = a(tabLayout, view2);
        drawable.setBounds(kc0.b((int)a.left, (int)a2.left, n), drawable.getBounds().top, kc0.b((int)a.right, (int)a2.right, n), drawable.getBounds().bottom);
    }
}
