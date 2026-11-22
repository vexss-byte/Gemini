# Lapergods Mod (Fabric 26.3) - Fase 2 (Fixed)

## Fitur Fase 2:
- Registrasi item & block `lapergods:thor_statue`.
- Integrasi `GeoBlockEntity` & `GeoBlockRenderer` GeckoLib 5.5.7.
- Model `.geo.json` & animasi `.animation.json` (idle loop 4s & power_up 3s).
- Perluasan render bounding box (`AABB`) agar tidak ter-cull saat ditempatkan di dunia.
- Interaksi klik kanan memicu animasi `power_up`.
- Perbaikan nama project `rootProject.name = 'lapergods'` di `settings.gradle` dan pola pencarian artifact `build/libs/*.jar` di `build.yml`.
