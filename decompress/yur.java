import android.content.pm.ComponentInfo;
import android.net.Uri$Builder;
import android.os.Bundle;
import java.io.InputStream;
import java.io.IOException;
import android.content.res.Resources$NotFoundException;
import java.util.List;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.net.Uri;
import android.view.ViewGroup;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import android.util.TypedValue;
import android.text.TextUtils;
import android.view.View;
import android.util.Log;
import android.database.Cursor;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import androidx.appcompat.widget.SearchView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yur extends uqm implements View$OnClickListener
{
    public static final int b1 = 0;
    public final SearchView O0;
    public final SearchableInfo P0;
    public final Context Q0;
    public final WeakHashMap<String, Drawable$ConstantState> R0;
    public final int S0;
    public int T0;
    public ColorStateList U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    
    public yur(final Context q0, final SearchView o0, final SearchableInfo p4, final WeakHashMap<String, Drawable$ConstantState> r0) {
        super(q0, o0.getSuggestionRowLayout());
        this.T0 = 1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.Y0 = -1;
        this.Z0 = -1;
        this.a1 = -1;
        this.O0 = o0;
        this.P0 = p4;
        this.S0 = o0.getSuggestionCommitIconResId();
        this.Q0 = q0;
        this.R0 = r0;
    }
    
    public static String p(final Cursor cursor, final int n) {
        if (n == -1) {
            return null;
        }
        try {
            return cursor.getString(n);
        }
        catch (final Exception ex) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)ex);
            return null;
        }
    }
    
    public final void a(final Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.V0 = cursor.getColumnIndex("suggest_text_1");
                this.W0 = cursor.getColumnIndex("suggest_text_2");
                this.X0 = cursor.getColumnIndex("suggest_text_2_url");
                this.Y0 = cursor.getColumnIndex("suggest_icon_1");
                this.Z0 = cursor.getColumnIndex("suggest_icon_2");
                this.a1 = cursor.getColumnIndex("suggest_flags");
            }
        }
        catch (final Exception ex) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", (Throwable)ex);
        }
    }
    
    public final CharSequence d(final Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        final String p = p(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (p != null) {
            return p;
        }
        if (this.P0.shouldRewriteQueryFromData()) {
            final String p2 = p(cursor, cursor.getColumnIndex("suggest_intent_data"));
            if (p2 != null) {
                return p2;
            }
        }
        if (this.P0.shouldRewriteQueryFromText()) {
            final String p3 = p(cursor, cursor.getColumnIndex("suggest_text_1"));
            if (p3 != null) {
                return p3;
            }
        }
        return null;
    }
    
    public final Cursor e(final CharSequence charSequence) {
        String string;
        if (charSequence == null) {
            string = "";
        }
        else {
            string = charSequence.toString();
        }
        if (((View)this.O0).getVisibility() == 0) {
            if (((View)this.O0).getWindowVisibility() == 0) {
                try {
                    final Cursor o = this.o(this.P0, string);
                    if (o != null) {
                        o.getCount();
                        return o;
                    }
                }
                catch (final RuntimeException ex) {
                    Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", (Throwable)ex);
                }
            }
        }
        return null;
    }
    
    public final void g(final View view, final Cursor cursor) {
        final yur.yur$a yur$a = (yur.yur$a)view.getTag();
        final int a1 = this.a1;
        int int1;
        if (a1 != -1) {
            int1 = cursor.getInt(a1);
        }
        else {
            int1 = 0;
        }
        if (yur$a.a != null) {
            final String p2 = p(cursor, this.V0);
            final TextView a2 = yur$a.a;
            a2.setText((CharSequence)p2);
            if (TextUtils.isEmpty((CharSequence)p2)) {
                ((View)a2).setVisibility(8);
            }
            else {
                ((View)a2).setVisibility(0);
            }
        }
        if (yur$a.b != null) {
            final String p3 = p(cursor, this.X0);
            Object p4;
            if (p3 != null) {
                if (this.U0 == null) {
                    final TypedValue typedValue = new TypedValue();
                    this.Q0.getTheme().resolveAttribute(2130970864, typedValue, true);
                    this.U0 = this.Q0.getResources().getColorStateList(typedValue.resourceId);
                }
                p4 = new SpannableString((CharSequence)p3);
                ((SpannableString)p4).setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.U0, (ColorStateList)null), 0, p3.length(), 33);
            }
            else {
                p4 = p(cursor, this.W0);
            }
            if (TextUtils.isEmpty((CharSequence)p4)) {
                final TextView a3 = yur$a.a;
                if (a3 != null) {
                    a3.setSingleLine(false);
                    yur$a.a.setMaxLines(2);
                }
            }
            else {
                final TextView a4 = yur$a.a;
                if (a4 != null) {
                    a4.setSingleLine(true);
                    yur$a.a.setMaxLines(1);
                }
            }
            final TextView b = yur$a.b;
            b.setText((CharSequence)p4);
            if (TextUtils.isEmpty((CharSequence)p4)) {
                ((View)b).setVisibility(8);
            }
            else {
                ((View)b).setVisibility(0);
            }
        }
        final ImageView c = yur$a.c;
        if (c != null) {
            final int y0 = this.Y0;
            Drawable drawable;
            if (y0 == -1) {
                drawable = null;
            }
            else {
                drawable = this.n(cursor.getString(y0));
                if (drawable == null) {
                    final ComponentName searchActivity = this.P0.getSearchActivity();
                    final String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.R0.containsKey(flattenToShortString)) {
                        final Drawable$ConstantState drawable$ConstantState = this.R0.get(flattenToShortString);
                        if (drawable$ConstantState == null) {
                            drawable = null;
                        }
                        else {
                            drawable = drawable$ConstantState.newDrawable(this.Q0.getResources());
                        }
                    }
                    else {
                        final PackageManager packageManager = this.Q0.getPackageManager();
                        Label_0526: {
                            try {
                                final ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                                final int iconResource = ((ComponentInfo)activityInfo).getIconResource();
                                if (iconResource != 0) {
                                    if ((drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo)) != null) {
                                        break Label_0526;
                                    }
                                    final StringBuilder l = da8.l("Invalid icon resource ", iconResource, " for ");
                                    l.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", l.toString());
                                }
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                Log.w("SuggestionsAdapter", ex.toString());
                            }
                            drawable = null;
                        }
                        Drawable$ConstantState constantState;
                        if (drawable == null) {
                            constantState = null;
                        }
                        else {
                            constantState = drawable.getConstantState();
                        }
                        this.R0.put(flattenToShortString, constantState);
                    }
                    if (drawable == null) {
                        drawable = this.Q0.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            this.q(c, drawable, 4);
        }
        final ImageView d = yur$a.d;
        if (d != null) {
            final int z0 = this.Z0;
            Drawable n;
            if (z0 == -1) {
                n = null;
            }
            else {
                n = this.n(cursor.getString(z0));
            }
            this.q(d, n, 8);
        }
        final int t0 = this.T0;
        if (t0 != 2 && (t0 != 1 || (int1 & 0x1) == 0x0)) {
            yur$a.e.setVisibility(8);
        }
        else {
            yur$a.e.setVisibility(0);
            ((View)yur$a.e).setTag((Object)yur$a.a.getText());
            ((View)yur$a.e).setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
        try {
            dropDownView = super.getDropDownView(n, dropDownView, viewGroup);
            return dropDownView;
        }
        catch (final RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View inflate = super.N0.inflate(super.M0, viewGroup, false);
            if (inflate != null) {
                ((yur.yur$a)inflate.getTag()).a.setText((CharSequence)ex.toString());
            }
            return inflate;
        }
    }
    
    public final View getView(final int n, View view, final ViewGroup viewGroup) {
        try {
            view = super.getView(n, view, viewGroup);
            return view;
        }
        catch (final RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View j = this.j(this.Q0, viewGroup);
            ((yur.yur$a)j.getTag()).a.setText((CharSequence)ex.toString());
            return j;
        }
    }
    
    public final View j(final Context context, final ViewGroup viewGroup) {
        final View inflate = super.N0.inflate(super.L0, viewGroup, false);
        inflate.setTag((Object)new yur.yur$a(inflate));
        ((ImageView)inflate.findViewById(2131428889)).setImageResource(this.S0);
        return inflate;
    }
    
    public final Drawable l(final Uri uri) throws FileNotFoundException {
        final String authority = uri.getAuthority();
        if (!TextUtils.isEmpty((CharSequence)authority)) {
            try {
                final Resources resourcesForApplication = this.Q0.getPackageManager().getResourcesForApplication(authority);
                final List pathSegments = uri.getPathSegments();
                if (pathSegments == null) {
                    throw new FileNotFoundException(k6e.f("No path: ", uri));
                }
                final int size = pathSegments.size();
                int n = 0;
                Label_0117: {
                    if (size == 1) {
                        try {
                            n = Integer.parseInt(pathSegments.get(0));
                            break Label_0117;
                        }
                        catch (final NumberFormatException ex) {
                            throw new FileNotFoundException(k6e.f("Single path segment is not a resource ID: ", uri));
                        }
                    }
                    if (size != 2) {
                        throw new FileNotFoundException(k6e.f("More than two path segments: ", uri));
                    }
                    n = resourcesForApplication.getIdentifier((String)pathSegments.get(1), (String)pathSegments.get(0), authority);
                }
                if (n != 0) {
                    return resourcesForApplication.getDrawable(n);
                }
                throw new FileNotFoundException(k6e.f("No resource found for: ", uri));
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                throw new FileNotFoundException(k6e.f("No package found for authority: ", uri));
            }
        }
        throw new FileNotFoundException(k6e.f("No authority: ", uri));
    }
    
    public final Drawable n(final String s) {
        final Drawable drawable = null;
        final Drawable drawable2 = null;
        Drawable drawable3 = drawable;
        if (s != null) {
            drawable3 = drawable;
            if (!s.isEmpty()) {
                if ("0".equals(s)) {
                    drawable3 = drawable;
                }
                else {
                    try {
                        final int int1 = Integer.parseInt(s);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("android.resource://");
                        sb.append(this.Q0.getPackageName());
                        sb.append("/");
                        sb.append(int1);
                        final String string = sb.toString();
                        final Drawable$ConstantState drawable$ConstantState = this.R0.get(string);
                        Drawable drawable4;
                        if (drawable$ConstantState == null) {
                            drawable4 = null;
                        }
                        else {
                            drawable4 = drawable$ConstantState.newDrawable();
                        }
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        final Context q0 = this.Q0;
                        final Object a = kn6.a;
                        final Drawable b = kn6.c.b(q0, int1);
                        if (b != null) {
                            this.R0.put(string, b.getConstantState());
                        }
                        return b;
                    }
                    catch (final Resources$NotFoundException ex) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Icon resource not found: ");
                        sb2.append(s);
                        Log.w("SuggestionsAdapter", sb2.toString());
                        return null;
                    }
                    catch (final NumberFormatException ex2) {
                        final Drawable$ConstantState drawable$ConstantState2 = this.R0.get(s);
                        Drawable drawable5;
                        if (drawable$ConstantState2 == null) {
                            drawable5 = null;
                        }
                        else {
                            drawable5 = drawable$ConstantState2.newDrawable();
                        }
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        final Uri parse = Uri.parse(s);
                        Drawable l = null;
                        Label_0588: {
                            try {
                                if ("android.resource".equals(parse.getScheme())) {
                                    try {
                                        l = this.l(parse);
                                        break Label_0588;
                                    }
                                    catch (final Resources$NotFoundException ex3) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Resource does not exist: ");
                                        sb3.append(parse);
                                        throw new FileNotFoundException(sb3.toString());
                                    }
                                }
                                final InputStream openInputStream = this.Q0.getContentResolver().openInputStream(parse);
                                if (openInputStream != null) {
                                    try {
                                        Drawable.createFromStream(openInputStream, (String)null);
                                        break Label_0588;
                                    }
                                    finally {
                                        try {
                                            openInputStream.close();
                                        }
                                        catch (final IOException ex4) {
                                            final StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Error closing icon stream for ");
                                            sb4.append(parse);
                                            Log.e("SuggestionsAdapter", sb4.toString(), (Throwable)ex4);
                                        }
                                    }
                                }
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Failed to open ");
                                sb5.append(parse);
                                throw new FileNotFoundException(sb5.toString());
                            }
                            catch (final FileNotFoundException ex5) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("Icon not found: ");
                                sb6.append(parse);
                                sb6.append(", ");
                                sb6.append(ex5.getMessage());
                                Log.w("SuggestionsAdapter", sb6.toString());
                                l = drawable2;
                            }
                        }
                        drawable3 = l;
                        if (l != null) {
                            this.R0.put(s, l.getConstantState());
                            drawable3 = l;
                        }
                    }
                }
            }
        }
        return drawable3;
    }
    
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        final Cursor f0 = super.F0;
        Bundle extras;
        if (f0 != null) {
            extras = f0.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }
    
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        final Cursor f0 = super.F0;
        Bundle extras;
        if (f0 != null) {
            extras = f0.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }
    
    public final Cursor o(final SearchableInfo searchableInfo, final String s) {
        final String[] array = null;
        if (searchableInfo == null) {
            return null;
        }
        final String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        final Uri$Builder fragment = new Uri$Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        final String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        final String suggestSelection = searchableInfo.getSuggestSelection();
        String[] array2;
        if (suggestSelection != null) {
            array2 = new String[] { s };
        }
        else {
            fragment.appendPath(s);
            array2 = array;
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.Q0.getContentResolver().query(fragment.build(), (String[])null, suggestSelection, array2, (String)null);
    }
    
    public final void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.O0.r((CharSequence)tag);
        }
    }
    
    public final void q(final ImageView imageView, final Drawable imageDrawable, final int visibility) {
        imageView.setImageDrawable(imageDrawable);
        if (imageDrawable == null) {
            imageView.setVisibility(visibility);
        }
        else {
            imageView.setVisibility(0);
            imageDrawable.setVisible(false, false);
            imageDrawable.setVisible(true, false);
        }
    }
}
