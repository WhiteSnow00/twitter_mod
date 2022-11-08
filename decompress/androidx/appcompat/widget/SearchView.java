// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.EditText;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.widget.ListAdapter;
import android.text.Editable;
import android.database.Cursor;
import android.util.Log;
import android.view.View$MeasureSpec;
import android.view.TouchDelegate;
import android.content.res.Resources;
import android.content.ComponentName;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.net.Uri;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.os.Bundle;
import android.app.SearchableInfo;

public class SearchView extends LinearLayoutCompat implements hq4
{
    public static final SearchView.SearchView$o P1;
    public String A1;
    public CharSequence B1;
    public boolean C1;
    public int D1;
    public SearchableInfo E1;
    public Bundle F1;
    public final SearchView$b G1;
    public SearchView$c H1;
    public final WeakHashMap<String, Drawable$ConstantState> I1;
    public final SearchView$f J1;
    public SearchView$g K1;
    public final SearchView$h L1;
    public final SearchView$i M1;
    public final SearchView$j N1;
    public SearchView$a O1;
    public final SearchView.SearchView$SearchAutoComplete R0;
    public final View S0;
    public final View T0;
    public final View U0;
    public final ImageView V0;
    public final ImageView W0;
    public final ImageView X0;
    public final ImageView Y0;
    public final View Z0;
    public SearchView.SearchView$p a1;
    public Rect b1;
    public Rect c1;
    public int[] d1;
    public int[] e1;
    public final ImageView f1;
    public final Drawable g1;
    public final int h1;
    public final int i1;
    public final Intent j1;
    public final Intent k1;
    public final CharSequence l1;
    public SearchView.SearchView$m m1;
    public SearchView.SearchView$l n1;
    public View$OnFocusChangeListener o1;
    public SearchView.SearchView$n p1;
    public View$OnClickListener q1;
    public boolean r1;
    public boolean s1;
    public o97 t1;
    public boolean u1;
    public CharSequence v1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public boolean z1;
    
    static {
        SearchView.SearchView$o p1;
        if (Build$VERSION.SDK_INT < 29) {
            p1 = new SearchView.SearchView$o();
        }
        else {
            p1 = null;
        }
        P1 = p1;
    }
    
    public SearchView(final Context context) {
        this(context, null);
    }
    
    public SearchView(final Context context, final AttributeSet set) {
        this(context, set, 2130970551);
    }
    
    public SearchView(final Context context, final AttributeSet set, int inputType) {
        super(context, set, inputType);
        this.b1 = new Rect();
        this.c1 = new Rect();
        this.d1 = new int[2];
        this.e1 = new int[2];
        this.G1 = new SearchView$b(this);
        this.H1 = new SearchView$c(this);
        this.I1 = new WeakHashMap<String, Drawable$ConstantState>();
        final SearchView$f searchView$f = new SearchView$f(this);
        this.J1 = searchView$f;
        this.K1 = new SearchView$g(this);
        final SearchView$h searchView$h = new SearchView$h(this);
        this.L1 = searchView$h;
        final SearchView$i searchView$i = new SearchView$i(this);
        this.M1 = searchView$i;
        final SearchView$j searchView$j = new SearchView$j(this);
        this.N1 = searchView$j;
        this.O1 = new SearchView$a(this);
        final int[] z0 = ck1.Z0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, z0, inputType, 0);
        final u9t u9t = new u9t(context, obtainStyledAttributes);
        p5x.y((View)this, context, z0, set, obtainStyledAttributes, inputType);
        LayoutInflater.from(context).inflate(u9t.l(9, 2131623961), (ViewGroup)this, true);
        final SearchView.SearchView$SearchAutoComplete r0 = (SearchView.SearchView$SearchAutoComplete)((View)this).findViewById(2131431281);
        (this.R0 = r0).setSearchView(this);
        this.S0 = ((View)this).findViewById(2131431268);
        final View viewById = ((View)this).findViewById(2131431277);
        this.T0 = viewById;
        final View viewById2 = ((View)this).findViewById(2131431781);
        this.U0 = viewById2;
        final ImageView v0 = (ImageView)((View)this).findViewById(2131431263);
        this.V0 = v0;
        final ImageView w0 = (ImageView)((View)this).findViewById(2131431271);
        this.W0 = w0;
        final ImageView x0 = (ImageView)((View)this).findViewById(2131431265);
        this.X0 = x0;
        final ImageView y0 = (ImageView)((View)this).findViewById(2131431286);
        this.Y0 = y0;
        final ImageView f1 = (ImageView)((View)this).findViewById(2131431275);
        this.f1 = f1;
        p5x$d.q(viewById, u9t.g(10));
        p5x$d.q(viewById2, u9t.g(14));
        v0.setImageDrawable(u9t.g(13));
        w0.setImageDrawable(u9t.g(7));
        x0.setImageDrawable(u9t.g(4));
        y0.setImageDrawable(u9t.g(16));
        f1.setImageDrawable(u9t.g(13));
        this.g1 = u9t.g(12);
        hit.a((View)v0, (CharSequence)((View)this).getResources().getString(2131951758));
        this.h1 = u9t.l(15, 2131623960);
        this.i1 = u9t.l(5, 0);
        ((View)v0).setOnClickListener((View$OnClickListener)searchView$f);
        ((View)x0).setOnClickListener((View$OnClickListener)searchView$f);
        ((View)w0).setOnClickListener((View$OnClickListener)searchView$f);
        ((View)y0).setOnClickListener((View$OnClickListener)searchView$f);
        ((View)r0).setOnClickListener((View$OnClickListener)searchView$f);
        ((TextView)r0).addTextChangedListener((TextWatcher)this.O1);
        ((TextView)r0).setOnEditorActionListener((TextView$OnEditorActionListener)searchView$h);
        ((AutoCompleteTextView)r0).setOnItemClickListener((AdapterView$OnItemClickListener)searchView$i);
        ((AutoCompleteTextView)r0).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)searchView$j);
        ((View)r0).setOnKeyListener((View$OnKeyListener)this.K1);
        ((View)r0).setOnFocusChangeListener((View$OnFocusChangeListener)new SearchView$d(this));
        this.setIconifiedByDefault(u9t.a(8, true));
        inputType = u9t.f(1, -1);
        if (inputType != -1) {
            this.setMaxWidth(inputType);
        }
        this.l1 = u9t.n(6);
        this.v1 = u9t.n(11);
        inputType = u9t.j(3, -1);
        if (inputType != -1) {
            this.setImeOptions(inputType);
        }
        inputType = u9t.j(2, -1);
        if (inputType != -1) {
            this.setInputType(inputType);
        }
        ((View)this).setFocusable(u9t.a(0, true));
        u9t.r();
        final Intent j1 = new Intent("android.speech.action.WEB_SEARCH");
        (this.j1 = j1).addFlags(268435456);
        j1.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        (this.k1 = new Intent("android.speech.action.RECOGNIZE_SPEECH")).addFlags(268435456);
        final View viewById3 = ((View)this).findViewById(((AutoCompleteTextView)r0).getDropDownAnchor());
        if ((this.Z0 = viewById3) != null) {
            viewById3.addOnLayoutChangeListener((View$OnLayoutChangeListener)new SearchView$e(this));
        }
        this.z(this.r1);
        this.w();
    }
    
    private int getPreferredHeight() {
        return ((View)this).getContext().getResources().getDimensionPixelSize(2131165238);
    }
    
    private int getPreferredWidth() {
        return ((View)this).getContext().getResources().getDimensionPixelSize(2131165239);
    }
    
    private void setQuery(final CharSequence text) {
        ((TextView)this.R0).setText(text);
        final SearchView.SearchView$SearchAutoComplete r0 = this.R0;
        int length;
        if (TextUtils.isEmpty(text)) {
            length = 0;
        }
        else {
            length = text.length();
        }
        ((EditText)r0).setSelection(length);
    }
    
    public final void A(final boolean b) {
        final boolean z1 = this.z1;
        int visibility;
        final int n = visibility = 8;
        if (z1) {
            visibility = n;
            if (!this.s1) {
                visibility = n;
                if (b) {
                    this.W0.setVisibility(8);
                    visibility = 0;
                }
            }
        }
        this.Y0.setVisibility(visibility);
    }
    
    public final void b() {
        if (this.C1) {
            return;
        }
        this.C1 = true;
        final int imeOptions = ((TextView)this.R0).getImeOptions();
        this.D1 = imeOptions;
        ((TextView)this.R0).setImeOptions(imeOptions | 0x2000000);
        ((TextView)this.R0).setText((CharSequence)"");
        this.setIconified(false);
    }
    
    public final void clearFocus() {
        this.x1 = true;
        super.clearFocus();
        ((View)this.R0).clearFocus();
        this.R0.setImeVisibility(false);
        this.x1 = false;
    }
    
    public final void e() {
        ((TextView)this.R0).setText((CharSequence)"");
        final SearchView.SearchView$SearchAutoComplete r0 = this.R0;
        ((EditText)r0).setSelection(((TextView)r0).length());
        this.B1 = "";
        this.clearFocus();
        this.z(true);
        ((TextView)this.R0).setImeOptions(this.D1);
        this.C1 = false;
    }
    
    public int getImeOptions() {
        return ((TextView)this.R0).getImeOptions();
    }
    
    public int getInputType() {
        return ((TextView)this.R0).getInputType();
    }
    
    public int getMaxWidth() {
        return this.y1;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)((EditText)this.R0).getText();
    }
    
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.v1;
        if (charSequence == null) {
            final SearchableInfo e1 = this.E1;
            if (e1 != null && e1.getHintId() != 0) {
                charSequence = ((View)this).getContext().getText(this.E1.getHintId());
            }
            else {
                charSequence = this.l1;
            }
        }
        return charSequence;
    }
    
    public int getSuggestionCommitIconResId() {
        return this.i1;
    }
    
    public int getSuggestionRowLayout() {
        return this.h1;
    }
    
    public o97 getSuggestionsAdapter() {
        return this.t1;
    }
    
    public final Intent l(final String s, final Uri data, final String s2, final String s3) {
        final Intent intent = new Intent(s);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.B1);
        if (s3 != null) {
            intent.putExtra("query", s3);
        }
        if (s2 != null) {
            intent.putExtra("intent_extra_data_key", s2);
        }
        final Bundle f1 = this.F1;
        if (f1 != null) {
            intent.putExtra("app_data", f1);
        }
        intent.setComponent(this.E1.getSearchActivity());
        return intent;
    }
    
    public final Intent m(final Intent intent, final SearchableInfo searchableInfo) {
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        final Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        final PendingIntent activity = PendingIntent.getActivity(((View)this).getContext(), 0, intent2, 1107296256);
        final Bundle bundle = new Bundle();
        final Bundle f1 = this.F1;
        if (f1 != null) {
            bundle.putParcelable("app_data", (Parcelable)f1);
        }
        final Intent intent3 = new Intent(intent);
        int voiceMaxResults = 1;
        final Resources resources = ((View)this).getResources();
        String string;
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        else {
            string = "free_form";
        }
        final int voicePromptTextId = searchableInfo.getVoicePromptTextId();
        final String s = null;
        String string2;
        if (voicePromptTextId != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        }
        else {
            string2 = null;
        }
        String string3;
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        }
        else {
            string3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = s;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", flattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }
    
    public final void n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          29
        //     5: if_icmplt       18
        //     8: aload_0        
        //     9: getfield        androidx/appcompat/widget/SearchView.R0:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
        //    12: invokestatic    androidx/appcompat/widget/SearchView$k.a:(Landroid/widget/AutoCompleteTextView;)V
        //    15: goto            90
        //    18: getstatic       androidx/appcompat/widget/SearchView.P1:Landroidx/appcompat/widget/SearchView$o;
        //    21: astore_1       
        //    22: aload_0        
        //    23: getfield        androidx/appcompat/widget/SearchView.R0:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
        //    26: astore_2       
        //    27: aload_1        
        //    28: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    31: pop            
        //    32: invokestatic    androidx/appcompat/widget/SearchView$o.a:()V
        //    35: aload_1        
        //    36: getfield        androidx/appcompat/widget/SearchView$o.a:Ljava/lang/reflect/Method;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          54
        //    44: aload_1        
        //    45: aload_2        
        //    46: iconst_0       
        //    47: anewarray       Ljava/lang/Object;
        //    50: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    53: pop            
        //    54: getstatic       androidx/appcompat/widget/SearchView.P1:Landroidx/appcompat/widget/SearchView$o;
        //    57: astore_1       
        //    58: aload_0        
        //    59: getfield        androidx/appcompat/widget/SearchView.R0:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
        //    62: astore_2       
        //    63: aload_1        
        //    64: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    67: pop            
        //    68: invokestatic    androidx/appcompat/widget/SearchView$o.a:()V
        //    71: aload_1        
        //    72: getfield        androidx/appcompat/widget/SearchView$o.b:Ljava/lang/reflect/Method;
        //    75: astore_1       
        //    76: aload_1        
        //    77: ifnull          90
        //    80: aload_1        
        //    81: aload_2        
        //    82: iconst_0       
        //    83: anewarray       Ljava/lang/Object;
        //    86: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    89: pop            
        //    90: return         
        //    91: astore_2       
        //    92: goto            54
        //    95: astore_2       
        //    96: goto            90
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  44     54     91     95     Ljava/lang/Exception;
        //  80     90     95     99     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void o() {
        if (TextUtils.isEmpty((CharSequence)((EditText)this.R0).getText())) {
            if (this.r1) {
                final SearchView.SearchView$l n1 = this.n1;
                if (n1 == null || !n1.onClose()) {
                    this.clearFocus();
                    this.z(true);
                }
            }
        }
        else {
            ((TextView)this.R0).setText((CharSequence)"");
            ((View)this.R0).requestFocus();
            this.R0.setImeVisibility(true);
        }
    }
    
    public final void onDetachedFromWindow() {
        ((View)this).removeCallbacks((Runnable)this.G1);
        ((View)this).post((Runnable)this.H1);
        super.onDetachedFromWindow();
    }
    
    public final void onLayout(final boolean b, int n, final int n2, int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            final SearchView.SearchView$SearchAutoComplete r0 = this.R0;
            final Rect b2 = this.b1;
            ((View)r0).getLocationInWindow(this.d1);
            ((View)this).getLocationInWindow(this.e1);
            final int[] d1 = this.d1;
            n = d1[1];
            final int[] e1 = this.e1;
            n -= e1[1];
            n3 = d1[0] - e1[0];
            b2.set(n3, n, ((View)r0).getWidth() + n3, ((View)r0).getHeight() + n);
            final Rect c1 = this.c1;
            final Rect b3 = this.b1;
            c1.set(b3.left, 0, b3.right, n4 - n2);
            final SearchView.SearchView$p a1 = this.a1;
            if (a1 == null) {
                ((View)this).setTouchDelegate((TouchDelegate)(this.a1 = new SearchView.SearchView$p(this.c1, this.b1, (View)this.R0)));
            }
            else {
                a1.a(this.c1, this.b1);
            }
        }
    }
    
    public final void onMeasure(int n, int n2) {
        if (this.s1) {
            super.onMeasure(n, n2);
            return;
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    n = size;
                }
                else {
                    final int y1 = this.y1;
                    n = size;
                    if (y1 > 0) {
                        n = Math.min(y1, size);
                    }
                }
            }
            else {
                n = this.y1;
                if (n <= 0) {
                    n = this.getPreferredWidth();
                }
            }
        }
        else {
            n = this.y1;
            if (n > 0) {
                n = Math.min(n, size);
            }
            else {
                n = Math.min(this.getPreferredWidth(), size);
            }
        }
        final int mode2 = View$MeasureSpec.getMode(n2);
        n2 = View$MeasureSpec.getSize(n2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                n2 = this.getPreferredHeight();
            }
        }
        else {
            n2 = Math.min(this.getPreferredHeight(), n2);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.z(savedState.isIconified);
        ((View)this).requestLayout();
    }
    
    public final Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isIconified = this.s1;
        return (Parcelable)savedState;
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        ((View)this).post((Runnable)this.G1);
    }
    
    public final boolean p(int n) {
        final SearchView.SearchView$n p = this.p1;
        if (p != null && p.b()) {
            return false;
        }
        final Cursor e0 = this.t1.E0;
        if (e0 != null && e0.moveToPosition(n)) {
            final Intent intent = null;
            Intent l;
            try {
                n = gur.a1;
                String s;
                if ((s = gur.p(e0, e0.getColumnIndex("suggest_intent_action"))) == null) {
                    s = this.E1.getSuggestIntentAction();
                }
                String s2;
                if ((s2 = s) == null) {
                    s2 = "android.intent.action.SEARCH";
                }
                String s3;
                if ((s3 = gur.p(e0, e0.getColumnIndex("suggest_intent_data"))) == null) {
                    s3 = this.E1.getSuggestIntentData();
                }
                String string;
                if ((string = s3) != null) {
                    final String p2 = gur.p(e0, e0.getColumnIndex("suggest_intent_data_id"));
                    string = s3;
                    if (p2 != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s3);
                        sb.append("/");
                        sb.append(Uri.encode(p2));
                        string = sb.toString();
                    }
                }
                Uri parse;
                if (string == null) {
                    parse = null;
                }
                else {
                    parse = Uri.parse(string);
                }
                l = this.l(s2, parse, gur.p(e0, e0.getColumnIndex("suggest_intent_extra_data")), gur.p(e0, e0.getColumnIndex("suggest_intent_query")));
            }
            catch (final RuntimeException ex) {
                try {
                    n = e0.getPosition();
                }
                catch (final RuntimeException ex2) {
                    n = -1;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Search suggestions cursor at row ");
                sb2.append(n);
                sb2.append(" returned exception.");
                Log.w("SearchView", sb2.toString(), (Throwable)ex);
                l = intent;
            }
            if (l != null) {
                try {
                    ((View)this).getContext().startActivity(l);
                }
                catch (final RuntimeException ex3) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed launch activity: ");
                    sb3.append(l);
                    Log.e("SearchView", sb3.toString(), (Throwable)ex3);
                }
            }
        }
        this.R0.setImeVisibility(false);
        ((AutoCompleteTextView)this.R0).dismissDropDown();
        return true;
    }
    
    public final boolean q(final int n) {
        final SearchView.SearchView$n p = this.p1;
        if (p != null && p.a()) {
            return false;
        }
        final Editable text = ((EditText)this.R0).getText();
        final Cursor e0 = this.t1.E0;
        if (e0 != null) {
            if (e0.moveToPosition(n)) {
                final CharSequence d = this.t1.d(e0);
                if (d != null) {
                    this.setQuery(d);
                }
                else {
                    this.setQuery((CharSequence)text);
                }
            }
            else {
                this.setQuery((CharSequence)text);
            }
        }
        return true;
    }
    
    public final void r(final CharSequence query) {
        this.setQuery(query);
    }
    
    public final boolean requestFocus(final int n, final Rect rect) {
        if (this.x1) {
            return false;
        }
        if (!((View)this).isFocusable()) {
            return false;
        }
        if (!this.s1) {
            final boolean requestFocus = ((View)this.R0).requestFocus(n, rect);
            if (requestFocus) {
                this.z(false);
            }
            return requestFocus;
        }
        return super.requestFocus(n, rect);
    }
    
    public final void s() {
        this.z(false);
        ((View)this.R0).requestFocus();
        this.R0.setImeVisibility(true);
        final View$OnClickListener q1 = this.q1;
        if (q1 != null) {
            q1.onClick((View)this);
        }
    }
    
    public void setAppSearchData(final Bundle f1) {
        this.F1 = f1;
    }
    
    public void setIconified(final boolean b) {
        if (b) {
            this.o();
        }
        else {
            this.s();
        }
    }
    
    public void setIconifiedByDefault(final boolean r1) {
        if (this.r1 == r1) {
            return;
        }
        this.z(this.r1 = r1);
        this.w();
    }
    
    public void setImeOptions(final int imeOptions) {
        ((TextView)this.R0).setImeOptions(imeOptions);
    }
    
    public void setInputType(final int inputType) {
        ((TextView)this.R0).setInputType(inputType);
    }
    
    public void setMaxWidth(final int y1) {
        this.y1 = y1;
        ((View)this).requestLayout();
    }
    
    public void setOnCloseListener(final SearchView.SearchView$l n1) {
        this.n1 = n1;
    }
    
    public void setOnQueryTextFocusChangeListener(final View$OnFocusChangeListener o1) {
        this.o1 = o1;
    }
    
    public void setOnQueryTextListener(final SearchView.SearchView$m m1) {
        this.m1 = m1;
    }
    
    public void setOnSearchClickListener(final View$OnClickListener q1) {
        this.q1 = q1;
    }
    
    public void setOnSuggestionListener(final SearchView.SearchView$n p) {
        this.p1 = p;
    }
    
    public void setQueryHint(final CharSequence v1) {
        this.v1 = v1;
        this.w();
    }
    
    public void setQueryRefinementEnabled(final boolean w1) {
        this.w1 = w1;
        final o97 t1 = this.t1;
        if (t1 instanceof gur) {
            final gur gur = (gur)t1;
            int s0;
            if (w1) {
                s0 = 2;
            }
            else {
                s0 = 1;
            }
            gur.S0 = s0;
        }
    }
    
    public void setSearchableInfo(SearchableInfo e1) {
        this.E1 = e1;
        boolean z1 = true;
        final Intent intent = null;
        if (e1 != null) {
            this.R0.setThreshold(e1.getSuggestThreshold());
            ((TextView)this.R0).setImeOptions(this.E1.getImeOptions());
            int inputType;
            final int n = inputType = this.E1.getInputType();
            if ((n & 0xF) == 0x1) {
                inputType = (n & 0xFFFEFFFF);
                if (this.E1.getSuggestAuthority() != null) {
                    inputType = (inputType | 0x10000 | 0x80000);
                }
            }
            ((TextView)this.R0).setInputType(inputType);
            final o97 t1 = this.t1;
            if (t1 != null) {
                t1.a((Cursor)null);
            }
            if (this.E1.getSuggestAuthority() != null) {
                final gur gur = new gur(((View)this).getContext(), this, this.E1, this.I1);
                this.t1 = (o97)gur;
                ((AutoCompleteTextView)this.R0).setAdapter((ListAdapter)gur);
                final gur gur2 = (gur)this.t1;
                int s0;
                if (this.w1) {
                    s0 = 2;
                }
                else {
                    s0 = 1;
                }
                gur2.S0 = s0;
            }
            this.w();
        }
        e1 = this.E1;
        Label_0272: {
            if (e1 != null && e1.getVoiceSearchEnabled()) {
                Intent intent2;
                if (this.E1.getVoiceSearchLaunchWebSearch()) {
                    intent2 = this.j1;
                }
                else {
                    intent2 = intent;
                    if (this.E1.getVoiceSearchLaunchRecognizer()) {
                        intent2 = this.k1;
                    }
                }
                if (intent2 != null && ((View)this).getContext().getPackageManager().resolveActivity(intent2, 65536) != null) {
                    break Label_0272;
                }
            }
            z1 = false;
        }
        this.z1 = z1;
        if (z1) {
            ((TextView)this.R0).setPrivateImeOptions("nm");
        }
        this.z(this.s1);
    }
    
    public void setSubmitButtonEnabled(final boolean u1) {
        this.u1 = u1;
        this.z(this.s1);
    }
    
    public void setSuggestionsAdapter(final o97 o97) {
        this.t1 = o97;
        ((AutoCompleteTextView)this.R0).setAdapter((ListAdapter)o97);
    }
    
    public final void t() {
        final Editable text = ((EditText)this.R0).getText();
        if (text != null && TextUtils.getTrimmedLength((CharSequence)text) > 0) {
            final SearchView.SearchView$m m1 = this.m1;
            if (m1 != null) {
                ((CharSequence)text).toString();
                if (m1.a()) {
                    return;
                }
            }
            if (this.E1 != null) {
                ((View)this).getContext().startActivity(this.l("android.intent.action.SEARCH", null, null, ((CharSequence)text).toString()));
            }
            this.R0.setImeVisibility(false);
            ((AutoCompleteTextView)this.R0).dismissDropDown();
        }
    }
    
    public final void u() {
        final boolean empty = TextUtils.isEmpty((CharSequence)((EditText)this.R0).getText());
        final boolean b = true;
        final boolean b2 = empty ^ true;
        final int n = 0;
        int n2 = b ? 1 : 0;
        if (!b2) {
            if (this.r1 && !this.C1) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        final ImageView x0 = this.X0;
        int visibility;
        if (n2 != 0) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        x0.setVisibility(visibility);
        final Drawable drawable = this.X0.getDrawable();
        if (drawable != null) {
            int[] state;
            if (b2) {
                state = ViewGroup.ENABLED_STATE_SET;
            }
            else {
                state = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(state);
        }
    }
    
    public final void v() {
        int[] array;
        if (((View)this.R0).hasFocus()) {
            array = ViewGroup.FOCUSED_STATE_SET;
        }
        else {
            array = ViewGroup.EMPTY_STATE_SET;
        }
        final Drawable background = this.T0.getBackground();
        if (background != null) {
            background.setState(array);
        }
        final Drawable background2 = this.U0.getBackground();
        if (background2 != null) {
            background2.setState(array);
        }
        ((View)this).invalidate();
    }
    
    public final void w() {
        final CharSequence queryHint = this.getQueryHint();
        final SearchView.SearchView$SearchAutoComplete r0 = this.R0;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        Object hint = charSequence;
        if (this.r1) {
            if (this.g1 == null) {
                hint = charSequence;
            }
            else {
                final int n = (int)(((TextView)r0).getTextSize() * 1.25);
                this.g1.setBounds(0, 0, n, n);
                hint = new SpannableStringBuilder((CharSequence)"   ");
                ((SpannableStringBuilder)hint).setSpan((Object)new ImageSpan(this.g1), 1, 2, 33);
                ((SpannableStringBuilder)hint).append(charSequence);
            }
        }
        ((TextView)r0).setHint((CharSequence)hint);
    }
    
    public final void x() {
        final boolean u1 = this.u1;
        final int n = 0;
        int visibility = 0;
        Label_0066: {
            if ((u1 || this.z1) && !this.s1) {
                visibility = n;
                if (((View)this.W0).getVisibility() == 0) {
                    break Label_0066;
                }
                if (((View)this.Y0).getVisibility() == 0) {
                    visibility = n;
                    break Label_0066;
                }
            }
            visibility = 8;
        }
        this.U0.setVisibility(visibility);
    }
    
    public final void y(final boolean b) {
        final boolean u1 = this.u1;
        final int n = 0;
        int visibility = 0;
        Label_0074: {
            if (u1 && ((u1 || this.z1) && !this.s1) && ((View)this).hasFocus()) {
                visibility = n;
                if (b) {
                    break Label_0074;
                }
                if (!this.z1) {
                    visibility = n;
                    break Label_0074;
                }
            }
            visibility = 8;
        }
        this.W0.setVisibility(visibility);
    }
    
    public final void z(final boolean s1) {
        this.s1 = s1;
        final int n = 0;
        int visibility;
        if (s1) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        final boolean b = TextUtils.isEmpty((CharSequence)((EditText)this.R0).getText()) ^ true;
        this.V0.setVisibility(visibility);
        this.y(b);
        final View s2 = this.S0;
        int visibility2;
        if (s1) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        s2.setVisibility(visibility2);
        int visibility3 = 0;
        Label_0093: {
            if (this.f1.getDrawable() != null) {
                visibility3 = n;
                if (!this.r1) {
                    break Label_0093;
                }
            }
            visibility3 = 8;
        }
        this.f1.setVisibility(visibility3);
        this.u();
        this.A(b ^ true);
        this.x();
    }
    
    public static class SavedState extends fa
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public boolean isIconified;
        
        static {
            CREATOR = (Parcelable$Creator)new SearchView$SavedState$a();
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = (boolean)parcel.readValue((ClassLoader)null);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public String toString() {
            final StringBuilder g = w48.g("SearchView.SavedState{");
            g.append(Integer.toHexString(System.identityHashCode(this)));
            g.append(" isIconified=");
            return bd.y(g, this.isIconified, "}");
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeValue((Object)this.isIconified);
        }
    }
}
