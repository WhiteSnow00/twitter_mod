// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.widget;

import android.widget.TextView;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class ReadOnlyConversationComposer extends RelativeLayout
{
    public ReadOnlyConversationComposer(final Context context, final AttributeSet set) {
        super(context, set, 0);
        View.inflate(context, 2131624338, (ViewGroup)this);
        final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)context.getString(2131953365));
        text.append((CharSequence)" ");
        final int length = text.length();
        text.append((CharSequence)context.getString(2131954538));
        final int j = goz.J(context, 2130968591);
        text.setSpan((Object)new yzl(j, j, context), length, text.length(), 33);
        final TextView textView = (TextView)((View)this).findViewById(2131428978);
        lzq.c(textView);
        textView.setText((CharSequence)text);
    }
}
