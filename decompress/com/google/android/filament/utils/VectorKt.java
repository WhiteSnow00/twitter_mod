// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a\u000e\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0086\b\u001a\u001e\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000e\u001a\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000e\u001a(\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\b\u00f8\u0001\u0000\u001a(\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\b\u00f8\u0001\u0000\u001a(\u0010$\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\b\u00f8\u0001\u0000\u001a\u0015\u0010'\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010-\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010/\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061" }, d2 = { "abs", "Lcom/google/android/filament/utils/Float2;", "v", "Lcom/google/android/filament/utils/Float3;", "Lcom/google/android/filament/utils/Float4;", "all", "", "Lcom/google/android/filament/utils/Bool2;", "Lcom/google/android/filament/utils/Bool3;", "Lcom/google/android/filament/utils/Bool4;", "any", "clamp", "min", "max", "", "cross", "a", "b", "distance", "dot", "equal", "greaterThan", "greaterThanEqual", "length", "length2", "lessThan", "lessThanEqual", "mix", "x", "normalize", "notEqual", "reflect", "i", "n", "refract", "eta", "transform", "block", "Lkotlin/Function1;", "div", "eq", "gt", "gte", "lt", "lte", "minus", "neq", "plus", "times", "filament-utils-android_fullRelease" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class VectorKt
{
    public static final Float2 abs(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(Math.abs(float2.getX()), Math.abs(float2.getY()));
    }
    
    public static final Float3 abs(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float3(Math.abs(float3.getX()), Math.abs(float3.getY()), Math.abs(float3.getZ()));
    }
    
    public static final Float4 abs(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(Math.abs(float4.getX()), Math.abs(float4.getY()), Math.abs(float4.getZ()), Math.abs(float4.getW()));
    }
    
    public static final boolean all(final Bool2 bool2) {
        e0e.f((Object)bool2, "v");
        return bool2.getX() && bool2.getY();
    }
    
    public static final boolean all(final Bool3 bool3) {
        e0e.f((Object)bool3, "v");
        return bool3.getX() && bool3.getY() && bool3.getZ();
    }
    
    public static final boolean all(final Bool4 bool4) {
        e0e.f((Object)bool4, "v");
        return bool4.getX() && bool4.getY() && bool4.getZ() && bool4.getW();
    }
    
    public static final boolean any(final Bool2 bool2) {
        e0e.f((Object)bool2, "v");
        return bool2.getX() || bool2.getY();
    }
    
    public static final boolean any(final Bool3 bool3) {
        e0e.f((Object)bool3, "v");
        return bool3.getX() || bool3.getY() || bool3.getZ();
    }
    
    public static final boolean any(final Bool4 bool4) {
        e0e.f((Object)bool4, "v");
        return bool4.getX() || bool4.getY() || bool4.getZ() || bool4.getW();
    }
    
    public static final Float2 clamp(final Float2 float2, float n, final float n2) {
        e0e.f((Object)float2, "v");
        final float x = float2.getX();
        float n3;
        if (x < n) {
            n3 = n;
        }
        else {
            n3 = x;
            if (x > n2) {
                n3 = n2;
            }
        }
        final float y = float2.getY();
        if (y >= n) {
            if (y > n2) {
                n = n2;
            }
            else {
                n = y;
            }
        }
        return new Float2(n3, n);
    }
    
    public static final Float2 clamp(final Float2 float2, final Float2 float3, final Float2 float4) {
        e0e.f((Object)float2, "v");
        e0e.f((Object)float3, "min");
        e0e.f((Object)float4, "max");
        final float x = float2.getX();
        float x2 = float3.getX();
        final float x3 = float4.getX();
        if (x >= x2) {
            x2 = x;
            if (x > x3) {
                x2 = x3;
            }
        }
        final float y = float2.getY();
        float y2 = float3.getY();
        final float y3 = float4.getY();
        if (y >= y2) {
            y2 = y;
            if (y > y3) {
                y2 = y3;
            }
        }
        return new Float2(x2, y2);
    }
    
    public static final Float3 clamp(final Float3 float3, float n, final float n2) {
        e0e.f((Object)float3, "v");
        final float x = float3.getX();
        float n3;
        if (x < n) {
            n3 = n;
        }
        else {
            n3 = x;
            if (x > n2) {
                n3 = n2;
            }
        }
        final float y = float3.getY();
        float n4;
        if (y < n) {
            n4 = n;
        }
        else {
            n4 = y;
            if (y > n2) {
                n4 = n2;
            }
        }
        final float z = float3.getZ();
        if (z >= n) {
            if (z > n2) {
                n = n2;
            }
            else {
                n = z;
            }
        }
        return new Float3(n3, n4, n);
    }
    
    public static final Float3 clamp(final Float3 float3, final Float3 float4, final Float3 float5) {
        e0e.f((Object)float3, "v");
        e0e.f((Object)float4, "min");
        e0e.f((Object)float5, "max");
        final float x = float3.getX();
        float x2 = float4.getX();
        final float x3 = float5.getX();
        if (x >= x2) {
            x2 = x;
            if (x > x3) {
                x2 = x3;
            }
        }
        final float y = float3.getY();
        float y2 = float4.getY();
        final float y3 = float5.getY();
        if (y >= y2) {
            y2 = y;
            if (y > y3) {
                y2 = y3;
            }
        }
        final float z = float3.getZ();
        float z2 = float4.getZ();
        final float z3 = float5.getZ();
        if (z >= z2) {
            z2 = z;
            if (z > z3) {
                z2 = z3;
            }
        }
        return new Float3(x2, y2, z2);
    }
    
    public static final Float4 clamp(final Float4 float4, float n, final float n2) {
        e0e.f((Object)float4, "v");
        final float x = float4.getX();
        float n3;
        if (x < n) {
            n3 = n;
        }
        else {
            n3 = x;
            if (x > n2) {
                n3 = n2;
            }
        }
        final float y = float4.getY();
        float n4;
        if (y < n) {
            n4 = n;
        }
        else {
            n4 = y;
            if (y > n2) {
                n4 = n2;
            }
        }
        final float z = float4.getZ();
        float n5;
        if (z < n) {
            n5 = n;
        }
        else {
            n5 = z;
            if (z > n2) {
                n5 = n2;
            }
        }
        final float w = float4.getW();
        if (w >= n) {
            if (w > n2) {
                n = n2;
            }
            else {
                n = w;
            }
        }
        return new Float4(n3, n4, n5, n);
    }
    
    public static final Float4 clamp(final Float4 float4, final Float4 float5, final Float4 float6) {
        e0e.f((Object)float4, "v");
        e0e.f((Object)float5, "min");
        e0e.f((Object)float6, "max");
        final float x = float4.getX();
        float x2 = float5.getX();
        final float x3 = float6.getX();
        if (x >= x2) {
            x2 = x;
            if (x > x3) {
                x2 = x3;
            }
        }
        final float y = float4.getY();
        float y2 = float5.getY();
        final float y3 = float6.getY();
        if (y >= y2) {
            y2 = y;
            if (y > y3) {
                y2 = y3;
            }
        }
        final float z = float4.getZ();
        float z2 = float5.getZ();
        final float z3 = float6.getZ();
        if (z >= z2) {
            z2 = z;
            if (z > z3) {
                z2 = z3;
            }
        }
        final float w = float4.getW();
        float z4 = float5.getZ();
        final float w2 = float6.getW();
        if (w >= z4) {
            z4 = w;
            if (w > w2) {
                z4 = w2;
            }
        }
        return new Float4(x2, y2, z2, z4);
    }
    
    public static final Float3 cross(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        return new Float3(float4.getZ() * float3.getY() - float4.getY() * float3.getZ(), float4.getX() * float3.getZ() - float4.getZ() * float3.getX(), float4.getY() * float3.getX() - float4.getX() * float3.getY());
    }
    
    public static final float distance(Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        float2 = new Float2(float2.getX() - float3.getX(), float2.getY() - float3.getY());
        return (float)Math.sqrt(float2.getY() * float2.getY() + float2.getX() * float2.getX());
    }
    
    public static final float distance(Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        float3 = new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ());
        return (float)Math.sqrt(bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX())));
    }
    
    public static final float distance(Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        float4 = new Float4(float4.getX() - float5.getX(), float4.getY() - float5.getY(), float4.getZ() - float5.getZ(), float4.getW() - float5.getW());
        return (float)Math.sqrt(o6f.e(float4, float4.getW(), ffe.k(float4, float4.getZ(), a88.j(float4, float4.getY(), float4.getX() * float4.getX()))));
    }
    
    public static final Float2 div(final float n, final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(n / float2.getX(), n / float2.getY());
    }
    
    public static final Float3 div(final float n, final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float3(n / float3.getX(), n / float3.getY(), n / float3.getZ());
    }
    
    public static final Float4 div(final float n, final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(n / float4.getX(), n / float4.getY(), n / float4.getZ(), n / float4.getW());
    }
    
    public static final float dot(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        return float3.getY() * float2.getY() + float3.getX() * float2.getX();
    }
    
    public static final float dot(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        return bng.e(float4, float3.getZ(), ang.b(float4, float3.getY(), float4.getX() * float3.getX()));
    }
    
    public static final float dot(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        return o6f.e(float5, float4.getW(), ffe.k(float5, float4.getZ(), a88.j(float5, float4.getY(), float5.getX() * float4.getX())));
    }
    
    public static final Bool2 eq(final Float2 float2, final float n) {
        e0e.f((Object)float2, "<this>");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x == n;
        if (float2.getY() != n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 eq(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "<this>");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x == x2;
        if (float2.getY() != float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 eq(final Float3 float3, final float n) {
        e0e.f((Object)float3, "<this>");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x == n;
        final boolean b3 = float3.getY() == n;
        if (float3.getZ() != n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 eq(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x == x2;
        final boolean b3 = float3.getY() == float4.getY();
        if (float3.getZ() != float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 eq(final Float4 float4, final float n) {
        e0e.f((Object)float4, "<this>");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x == n;
        final boolean b3 = float4.getY() == n;
        final boolean b4 = float4.getZ() == n;
        if (float4.getW() != n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 eq(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "<this>");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x == x2;
        final boolean b3 = float4.getY() == float5.getY();
        final boolean b4 = float4.getZ() == float5.getZ();
        if (float4.getW() != float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 equal(final Float2 float2, final float n) {
        e0e.f((Object)float2, "a");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x == n;
        if (float2.getY() != n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 equal(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x == x2;
        if (float2.getY() != float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 equal(final Float3 float3, final float n) {
        e0e.f((Object)float3, "a");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x == n;
        final boolean b3 = float3.getY() == n;
        if (float3.getZ() != n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 equal(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x == x2;
        final boolean b3 = float3.getY() == float4.getY();
        if (float3.getZ() != float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 equal(final Float4 float4, final float n) {
        e0e.f((Object)float4, "a");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x == n;
        final boolean b3 = float4.getY() == n;
        final boolean b4 = float4.getZ() == n;
        if (float4.getW() != n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 equal(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x == x2;
        final boolean b3 = float4.getY() == float5.getY();
        final boolean b4 = float4.getZ() == float5.getZ();
        if (float4.getW() != float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 greaterThan(final Float2 float2, final float n) {
        e0e.f((Object)float2, "a");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x > n;
        if (float2.getY() <= n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 greaterThan(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float y = float3.getY();
        boolean b = true;
        final boolean b2 = x > y;
        if (float2.getY() <= float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 greaterThan(final Float3 float3, final float n) {
        e0e.f((Object)float3, "a");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x > n;
        final boolean b3 = float3.getY() > n;
        if (float3.getZ() <= n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 greaterThan(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float y = float4.getY();
        boolean b = true;
        final boolean b2 = x > y;
        final boolean b3 = float3.getY() > float4.getY();
        if (float3.getZ() <= float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 greaterThan(final Float4 float4, final float n) {
        e0e.f((Object)float4, "a");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x > n;
        final boolean b3 = float4.getY() > n;
        final boolean b4 = float4.getZ() > n;
        if (float4.getW() <= n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 greaterThan(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float y = float5.getY();
        boolean b = true;
        final boolean b2 = x > y;
        final boolean b3 = float4.getY() > float5.getY();
        final boolean b4 = float4.getZ() > float5.getZ();
        if (float4.getW() <= float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 greaterThanEqual(final Float2 float2, final float n) {
        e0e.f((Object)float2, "a");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x >= n;
        if (float2.getY() < n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 greaterThanEqual(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x >= x2;
        if (float2.getY() < float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 greaterThanEqual(final Float3 float3, final float n) {
        e0e.f((Object)float3, "a");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x >= n;
        final boolean b3 = float3.getY() >= n;
        if (float3.getZ() < n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 greaterThanEqual(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x >= x2;
        final boolean b3 = float3.getY() >= float4.getY();
        if (float3.getZ() < float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 greaterThanEqual(final Float4 float4, final float n) {
        e0e.f((Object)float4, "a");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x >= n;
        final boolean b3 = float4.getY() >= n;
        final boolean b4 = float4.getZ() >= n;
        if (float4.getW() < n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 greaterThanEqual(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x >= x2;
        final boolean b3 = float4.getY() >= float5.getY();
        final boolean b4 = float4.getZ() >= float5.getZ();
        if (float4.getW() < float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 gt(final Float2 float2, final float n) {
        e0e.f((Object)float2, "<this>");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x > n;
        if (float2.getY() <= n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 gt(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "<this>");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x > x2;
        if (float2.getY() <= float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 gt(final Float3 float3, final float n) {
        e0e.f((Object)float3, "<this>");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x > n;
        final boolean b3 = float3.getY() > n;
        if (float3.getZ() <= n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 gt(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x > x2;
        final boolean b3 = float3.getY() > float4.getY();
        if (float3.getZ() <= float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 gt(final Float4 float4, final float n) {
        e0e.f((Object)float4, "<this>");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x > n;
        final boolean b3 = float4.getY() > n;
        final boolean b4 = float4.getZ() > n;
        if (float4.getW() <= n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 gt(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "<this>");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x > x2;
        final boolean b3 = float4.getY() > float5.getY();
        final boolean b4 = float4.getZ() > float5.getZ();
        if (float4.getW() <= float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 gte(final Float2 float2, final float n) {
        e0e.f((Object)float2, "<this>");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x >= n;
        if (float2.getY() < n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 gte(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "<this>");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x >= x2;
        if (float2.getY() < float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 gte(final Float3 float3, final float n) {
        e0e.f((Object)float3, "<this>");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x >= n;
        final boolean b3 = float3.getY() >= n;
        if (float3.getZ() < n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 gte(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x >= x2;
        final boolean b3 = float3.getY() >= float4.getY();
        if (float3.getZ() < float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 gte(final Float4 float4, final float n) {
        e0e.f((Object)float4, "<this>");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x >= n;
        final boolean b3 = float4.getY() >= n;
        final boolean b4 = float4.getZ() >= n;
        if (float4.getW() < n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 gte(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "<this>");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x >= x2;
        final boolean b3 = float4.getY() >= float5.getY();
        final boolean b4 = float4.getZ() >= float5.getZ();
        if (float4.getW() < float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final float length(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return (float)Math.sqrt(float2.getY() * float2.getY() + float2.getX() * float2.getX());
    }
    
    public static final float length(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return (float)Math.sqrt(bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX())));
    }
    
    public static final float length(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return (float)Math.sqrt(o6f.e(float4, float4.getW(), ffe.k(float4, float4.getZ(), a88.j(float4, float4.getY(), float4.getX() * float4.getX()))));
    }
    
    public static final float length2(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return float2.getY() * float2.getY() + float2.getX() * float2.getX();
    }
    
    public static final float length2(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX()));
    }
    
    public static final float length2(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return o6f.e(float4, float4.getW(), ffe.k(float4, float4.getZ(), a88.j(float4, float4.getY(), float4.getX() * float4.getX())));
    }
    
    public static final Bool2 lessThan(final Float2 float2, final float n) {
        e0e.f((Object)float2, "a");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x < n;
        if (float2.getY() >= n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 lessThan(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x < x2;
        if (float2.getY() >= float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 lessThan(final Float3 float3, final float n) {
        e0e.f((Object)float3, "a");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x < n;
        final boolean b3 = float3.getY() < n;
        if (float3.getZ() >= n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 lessThan(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x < x2;
        final boolean b3 = float3.getY() < float4.getY();
        if (float3.getZ() >= float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 lessThan(final Float4 float4, final float n) {
        e0e.f((Object)float4, "a");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x < n;
        final boolean b3 = float4.getY() < n;
        final boolean b4 = float4.getZ() < n;
        if (float4.getW() >= n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 lessThan(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x < x2;
        final boolean b3 = float4.getY() < float5.getY();
        final boolean b4 = float4.getZ() < float5.getZ();
        if (float4.getW() >= float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 lessThanEqual(final Float2 float2, final float n) {
        e0e.f((Object)float2, "a");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x <= n;
        if (float2.getY() > n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 lessThanEqual(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x <= x2;
        if (float2.getY() > float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 lessThanEqual(final Float3 float3, final float n) {
        e0e.f((Object)float3, "a");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x <= n;
        final boolean b3 = float3.getY() <= n;
        if (float3.getZ() > n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 lessThanEqual(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x <= x2;
        final boolean b3 = float3.getY() <= float4.getY();
        if (float3.getZ() > float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 lessThanEqual(final Float4 float4, final float n) {
        e0e.f((Object)float4, "a");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x <= n;
        final boolean b3 = float4.getY() <= n;
        final boolean b4 = float4.getZ() <= n;
        if (float4.getW() > n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 lessThanEqual(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x <= x2;
        final boolean b3 = float4.getY() <= float5.getY();
        final boolean b4 = float4.getZ() <= float5.getZ();
        if (float4.getW() > float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 lt(final Float2 float2, final float n) {
        e0e.f((Object)float2, "<this>");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x < n;
        if (float2.getY() >= n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 lt(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "<this>");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x < x2;
        if (float2.getY() >= float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 lt(final Float3 float3, final float n) {
        e0e.f((Object)float3, "<this>");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x < n;
        final boolean b3 = float3.getY() < n;
        if (float3.getZ() >= n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 lt(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x < x2;
        final boolean b3 = float3.getY() < float4.getY();
        if (float3.getZ() >= float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 lt(final Float4 float4, final float n) {
        e0e.f((Object)float4, "<this>");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x < n;
        final boolean b3 = float4.getY() < n;
        final boolean b4 = float4.getZ() < n;
        if (float4.getW() >= n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 lt(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "<this>");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x < x2;
        final boolean b3 = float4.getY() < float5.getY();
        final boolean b4 = float4.getZ() < float5.getZ();
        if (float4.getW() >= float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool2 lte(final Float2 float2, final float n) {
        e0e.f((Object)float2, "<this>");
        final float x = float2.getX();
        boolean b = true;
        final boolean b2 = x <= n;
        if (float2.getY() > n) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool2 lte(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "<this>");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = true;
        final boolean b2 = x <= x2;
        if (float2.getY() > float3.getY()) {
            b = false;
        }
        return new Bool2(b2, b);
    }
    
    public static final Bool3 lte(final Float3 float3, final float n) {
        e0e.f((Object)float3, "<this>");
        final float x = float3.getX();
        boolean b = true;
        final boolean b2 = x <= n;
        final boolean b3 = float3.getY() <= n;
        if (float3.getZ() > n) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool3 lte(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = true;
        final boolean b2 = x <= x2;
        final boolean b3 = float3.getY() <= float4.getY();
        if (float3.getZ() > float4.getZ()) {
            b = false;
        }
        return new Bool3(b2, b3, b);
    }
    
    public static final Bool4 lte(final Float4 float4, final float n) {
        e0e.f((Object)float4, "<this>");
        final float x = float4.getX();
        boolean b = true;
        final boolean b2 = x <= n;
        final boolean b3 = float4.getY() <= n;
        final boolean b4 = float4.getZ() <= n;
        if (float4.getW() > n) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final Bool4 lte(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "<this>");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = true;
        final boolean b2 = x <= x2;
        final boolean b3 = float4.getY() <= float5.getY();
        final boolean b4 = float4.getZ() <= float5.getZ();
        if (float4.getW() > float5.getW()) {
            b = false;
        }
        return new Bool4(b2, b3, b4, b);
    }
    
    public static final float max(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return Math.max(float2.getX(), float2.getY());
    }
    
    public static final float max(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return Math.max(float3.getX(), Math.max(float3.getY(), float3.getZ()));
    }
    
    public static final float max(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return Math.max(float4.getX(), Math.max(float4.getY(), Math.max(float4.getZ(), float4.getW())));
    }
    
    public static final Float2 max(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        return new Float2(Math.max(float2.getX(), float3.getX()), Math.max(float2.getY(), float3.getY()));
    }
    
    public static final Float3 max(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        return new Float3(Math.max(float3.getX(), float4.getX()), Math.max(float3.getY(), float4.getY()), Math.max(float3.getZ(), float4.getZ()));
    }
    
    public static final Float4 max(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        return new Float4(Math.max(float4.getX(), float5.getX()), Math.max(float4.getY(), float5.getY()), Math.max(float4.getZ(), float5.getZ()), Math.max(float4.getW(), float5.getW()));
    }
    
    public static final float min(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return Math.min(float2.getX(), float2.getY());
    }
    
    public static final float min(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return Math.min(float3.getX(), Math.min(float3.getY(), float3.getZ()));
    }
    
    public static final float min(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return Math.min(float4.getX(), Math.min(float4.getY(), Math.min(float4.getZ(), float4.getW())));
    }
    
    public static final Float2 min(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        return new Float2(Math.min(float2.getX(), float3.getX()), Math.min(float2.getY(), float3.getY()));
    }
    
    public static final Float3 min(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        return new Float3(Math.min(float3.getX(), float4.getX()), Math.min(float3.getY(), float4.getY()), Math.min(float3.getZ(), float4.getZ()));
    }
    
    public static final Float4 min(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        return new Float4(Math.min(float4.getX(), float5.getX()), Math.min(float4.getY(), float5.getY()), Math.min(float4.getZ(), float5.getZ()), Math.min(float4.getW(), float5.getW()));
    }
    
    public static final Float2 minus(final float n, final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(n - float2.getX(), n - float2.getY());
    }
    
    public static final Float3 minus(final float n, final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float3(n - float3.getX(), n - float3.getY(), n - float3.getZ());
    }
    
    public static final Float4 minus(final float n, final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(n - float4.getX(), n - float4.getY(), n - float4.getZ(), n - float4.getW());
    }
    
    public static final Float2 mix(final Float2 float2, final Float2 float3, final float n) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        final float n2 = 1.0f - n;
        return new Float2(x2 * n + x * n2, float3.getY() * n + float2.getY() * n2);
    }
    
    public static final Float2 mix(final Float2 float2, final Float2 float3, final Float2 float4) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        e0e.f((Object)float4, "x");
        final float x = float2.getX();
        final float x2 = float3.getX();
        final float x3 = float4.getX();
        final float y = float2.getY();
        final float y2 = float3.getY();
        final float y3 = float4.getY();
        return new Float2(x2 * x3 + (1.0f - x3) * x, y2 * y3 + (1.0f - y3) * y);
    }
    
    public static final Float3 mix(final Float3 float3, final Float3 float4, final float n) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        final float n2 = 1.0f - n;
        return new Float3(x2 * n + x * n2, float4.getY() * n + float3.getY() * n2, float4.getZ() * n + float3.getZ() * n2);
    }
    
    public static final Float3 mix(final Float3 float3, final Float3 float4, final Float3 float5) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        e0e.f((Object)float5, "x");
        final float x = float3.getX();
        final float x2 = float4.getX();
        final float x3 = float5.getX();
        final float y = float3.getY();
        final float y2 = float4.getY();
        final float y3 = float5.getY();
        final float z = float3.getZ();
        final float z2 = float4.getZ();
        final float z3 = float5.getZ();
        return new Float3(x2 * x3 + (1.0f - x3) * x, y2 * y3 + (1.0f - y3) * y, z2 * z3 + (1.0f - z3) * z);
    }
    
    public static final Float4 mix(final Float4 float4, final Float4 float5, final float n) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        final float n2 = 1.0f - n;
        return new Float4(x2 * n + x * n2, float5.getY() * n + float4.getY() * n2, float5.getZ() * n + float4.getZ() * n2, float5.getW() * n + float4.getW() * n2);
    }
    
    public static final Float4 mix(final Float4 float4, final Float4 float5, final Float4 float6) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        e0e.f((Object)float6, "x");
        final float x = float4.getX();
        final float x2 = float5.getX();
        final float x3 = float6.getX();
        final float y = float4.getY();
        final float y2 = float5.getY();
        final float y3 = float6.getY();
        final float z = float4.getZ();
        final float z2 = float5.getZ();
        final float z3 = float6.getZ();
        final float w = float4.getW();
        final float w2 = float5.getW();
        final float w3 = float6.getW();
        return new Float4(x2 * x3 + (1.0f - x3) * x, y2 * y3 + (1.0f - y3) * y, z2 * z3 + (1.0f - z3) * z, w2 * w3 + (1.0f - w3) * w);
    }
    
    public static final Bool2 neq(final Float2 float2, final float n) {
        e0e.f((Object)float2, "<this>");
        final float x = float2.getX();
        boolean b = false;
        final boolean b2 = x == n;
        if (float2.getY() == n) {
            b = true;
        }
        return new Bool2(b2 ^ true, b ^ true);
    }
    
    public static final Bool2 neq(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "<this>");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = false;
        final boolean b2 = x == x2;
        if (float2.getY() == float3.getY()) {
            b = true;
        }
        return new Bool2(b2 ^ true, b ^ true);
    }
    
    public static final Bool3 neq(final Float3 float3, final float n) {
        e0e.f((Object)float3, "<this>");
        final float x = float3.getX();
        boolean b = false;
        final boolean b2 = x == n;
        final boolean b3 = float3.getY() == n;
        if (float3.getZ() == n) {
            b = true;
        }
        return new Bool3(b2 ^ true, b3 ^ true, b ^ true);
    }
    
    public static final Bool3 neq(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = false;
        final boolean b2 = x == x2;
        final boolean b3 = float3.getY() == float4.getY();
        if (float3.getZ() == float4.getZ()) {
            b = true;
        }
        return new Bool3(b2 ^ true, b3 ^ true, b ^ true);
    }
    
    public static final Bool4 neq(final Float4 float4, final float n) {
        e0e.f((Object)float4, "<this>");
        final float x = float4.getX();
        boolean b = false;
        final boolean b2 = x == n;
        final boolean b3 = float4.getY() == n;
        final boolean b4 = float4.getZ() == n;
        if (float4.getW() == n) {
            b = true;
        }
        return new Bool4(b2 ^ true, b3 ^ true, b4 ^ true, b ^ true);
    }
    
    public static final Bool4 neq(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "<this>");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = false;
        final boolean b2 = x == x2;
        final boolean b3 = float4.getY() == float5.getY();
        final boolean b4 = float4.getZ() == float5.getZ();
        if (float4.getW() == float5.getW()) {
            b = true;
        }
        return new Bool4(b2 ^ true, b3 ^ true, b4 ^ true, b ^ true);
    }
    
    public static final Float2 normalize(final Float2 float2) {
        e0e.f((Object)float2, "v");
        final float n = 1.0f / (float)Math.sqrt(float2.getY() * float2.getY() + float2.getX() * float2.getX());
        return new Float2(float2.getX() * n, float2.getY() * n);
    }
    
    public static final Float3 normalize(final Float3 float3) {
        e0e.f((Object)float3, "v");
        final float n = 1.0f / (float)Math.sqrt(bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX())));
        return new Float3(float3.getX() * n, float3.getY() * n, float3.getZ() * n);
    }
    
    public static final Float4 normalize(final Float4 float4) {
        e0e.f((Object)float4, "v");
        final float n = 1.0f / (float)Math.sqrt(o6f.e(float4, float4.getW(), ffe.k(float4, float4.getZ(), a88.j(float4, float4.getY(), float4.getX() * float4.getX()))));
        return new Float4(float4.getX() * n, float4.getY() * n, float4.getZ() * n, float4.getW() * n);
    }
    
    public static final Bool2 notEqual(final Float2 float2, final float n) {
        e0e.f((Object)float2, "a");
        final float x = float2.getX();
        boolean b = false;
        final boolean b2 = x == n;
        if (float2.getY() == n) {
            b = true;
        }
        return new Bool2(b2 ^ true, b ^ true);
    }
    
    public static final Bool2 notEqual(final Float2 float2, final Float2 float3) {
        e0e.f((Object)float2, "a");
        e0e.f((Object)float3, "b");
        final float x = float2.getX();
        final float x2 = float3.getX();
        boolean b = false;
        final boolean b2 = x == x2;
        if (float2.getY() == float3.getY()) {
            b = true;
        }
        return new Bool2(b2 ^ true, b ^ true);
    }
    
    public static final Bool3 notEqual(final Float3 float3, final float n) {
        e0e.f((Object)float3, "a");
        final float x = float3.getX();
        boolean b = false;
        final boolean b2 = x == n;
        final boolean b3 = float3.getY() == n;
        if (float3.getZ() == n) {
            b = true;
        }
        return new Bool3(b2 ^ true, b3 ^ true, b ^ true);
    }
    
    public static final Bool3 notEqual(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "a");
        e0e.f((Object)float4, "b");
        final float x = float3.getX();
        final float x2 = float4.getX();
        boolean b = false;
        final boolean b2 = x == x2;
        final boolean b3 = float3.getY() == float4.getY();
        if (float3.getZ() == float4.getZ()) {
            b = true;
        }
        return new Bool3(b2 ^ true, b3 ^ true, b ^ true);
    }
    
    public static final Bool4 notEqual(final Float4 float4, final float n) {
        e0e.f((Object)float4, "a");
        final float x = float4.getX();
        boolean b = false;
        final boolean b2 = x == n;
        final boolean b3 = float4.getY() == n;
        final boolean b4 = float4.getZ() == n;
        if (float4.getW() == n) {
            b = true;
        }
        return new Bool4(b2 ^ true, b3 ^ true, b4 ^ true, b ^ true);
    }
    
    public static final Bool4 notEqual(final Float4 float4, final Float4 float5) {
        e0e.f((Object)float4, "a");
        e0e.f((Object)float5, "b");
        final float x = float4.getX();
        final float x2 = float5.getX();
        boolean b = false;
        final boolean b2 = x == x2;
        final boolean b3 = float4.getY() == float5.getY();
        final boolean b4 = float4.getZ() == float5.getZ();
        if (float4.getW() == float5.getW()) {
            b = true;
        }
        return new Bool4(b2 ^ true, b3 ^ true, b4 ^ true, b ^ true);
    }
    
    public static final Float2 plus(final float n, final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(float2.getX() + n, float2.getY() + n);
    }
    
    public static final Float3 plus(final float n, final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float3(float3.getX() + n, float3.getY() + n, float3.getZ() + n);
    }
    
    public static final Float4 plus(final float n, final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(float4.getX() + n, float4.getY() + n, float4.getZ() + n, float4.getW() + n);
    }
    
    public static final Float2 reflect(final Float2 float2, Float2 float3) {
        e0e.f((Object)float2, "i");
        e0e.f((Object)float3, "n");
        final float n = (float2.getY() * float3.getY() + float2.getX() * float3.getX()) * 2.0f;
        float3 = new Float2(float3.getX() * n, float3.getY() * n);
        return new Float2(float2.getX() - float3.getX(), float2.getY() - float3.getY());
    }
    
    public static final Float3 reflect(final Float3 float3, Float3 float4) {
        e0e.f((Object)float3, "i");
        e0e.f((Object)float4, "n");
        final float n = (float3.getZ() * float4.getZ() + ang.b(float3, float4.getY(), float3.getX() * float4.getX())) * 2.0f;
        float4 = new Float3(float4.getX() * n, float4.getY() * n, float4.getZ() * n);
        return new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ());
    }
    
    public static final Float2 refract(Float2 float2, Float2 float3, float n) {
        e0e.f((Object)float2, "i");
        e0e.f((Object)float3, "n");
        final float n2 = float2.getY() * float3.getY() + float2.getX() * float3.getX();
        final float n3 = 1.0f - (1.0f - n2 * n2) * (n * n);
        if (n3 < 0.0f) {
            float2 = new Float2(0.0f);
        }
        else {
            float2 = new Float2(float2.getX() * n, float2.getY() * n);
            n = n * n2 + (float)Math.sqrt(n3);
            float3 = new Float2(float3.getX() * n, float3.getY() * n);
            float2 = new Float2(float2.getX() - float3.getX(), float2.getY() - float3.getY());
        }
        return float2;
    }
    
    public static final Float3 refract(Float3 float3, Float3 float4, float n) {
        e0e.f((Object)float3, "i");
        e0e.f((Object)float4, "n");
        final float e = bng.e(float3, float4.getZ(), ang.b(float3, float4.getY(), float3.getX() * float4.getX()));
        final float n2 = 1.0f - (1.0f - e * e) * (n * n);
        if (n2 < 0.0f) {
            float3 = new Float3(0.0f);
        }
        else {
            float3 = new Float3(float3.getX() * n, float3.getY() * n, float3.getZ() * n);
            n = n * e + (float)Math.sqrt(n2);
            float4 = new Float3(float4.getX() * n, float4.getY() * n, float4.getZ() * n);
            float3 = new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ());
        }
        return float3;
    }
    
    public static final Float2 times(final float n, final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(float2.getX() * n, float2.getY() * n);
    }
    
    public static final Float3 times(final float n, final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float3(float3.getX() * n, float3.getY() * n, float3.getZ() * n);
    }
    
    public static final Float4 times(final float n, final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(float4.getX() * n, float4.getY() * n, float4.getZ() * n, float4.getW() * n);
    }
    
    public static final Float2 transform(Float2 copy$default, final stb<? super Float, Float> stb) {
        e0e.f((Object)copy$default, "v");
        e0e.f((Object)stb, "block");
        copy$default = Float2.copy$default(copy$default, 0.0f, 0.0f, 3, null);
        copy$default.setX(((Number)stb.invoke((Object)copy$default.getX())).floatValue());
        copy$default.setY(((Number)stb.invoke((Object)copy$default.getY())).floatValue());
        return copy$default;
    }
    
    public static final Float3 transform(Float3 copy$default, final stb<? super Float, Float> stb) {
        e0e.f((Object)copy$default, "v");
        e0e.f((Object)stb, "block");
        copy$default = Float3.copy$default(copy$default, 0.0f, 0.0f, 0.0f, 7, null);
        copy$default.setX(((Number)stb.invoke((Object)copy$default.getX())).floatValue());
        copy$default.setY(((Number)stb.invoke((Object)copy$default.getY())).floatValue());
        copy$default.setZ(((Number)stb.invoke((Object)copy$default.getZ())).floatValue());
        return copy$default;
    }
    
    public static final Float4 transform(Float4 copy$default, final stb<? super Float, Float> stb) {
        e0e.f((Object)copy$default, "v");
        e0e.f((Object)stb, "block");
        copy$default = Float4.copy$default(copy$default, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        copy$default.setX(((Number)stb.invoke((Object)copy$default.getX())).floatValue());
        copy$default.setY(((Number)stb.invoke((Object)copy$default.getY())).floatValue());
        copy$default.setZ(((Number)stb.invoke((Object)copy$default.getZ())).floatValue());
        copy$default.setW(((Number)stb.invoke((Object)copy$default.getW())).floatValue());
        return copy$default;
    }
    
    public static final Float3 x(final Float3 float3, final Float3 float4) {
        e0e.f((Object)float3, "<this>");
        e0e.f((Object)float4, "v");
        return new Float3(float4.getZ() * float3.getY() - float4.getY() * float3.getZ(), float4.getX() * float3.getZ() - float4.getZ() * float3.getX(), float4.getY() * float3.getX() - float4.getX() * float3.getY());
    }
}
