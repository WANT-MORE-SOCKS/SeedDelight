package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AppleskinLibraryAccessors laccForAppleskinLibraryAccessors = new AppleskinLibraryAccessors(owner);
    private final ArchitecturyLibraryAccessors laccForArchitecturyLibraryAccessors = new ArchitecturyLibraryAccessors(owner);
    private final BettermodsbuttonLibraryAccessors laccForBettermodsbuttonLibraryAccessors = new BettermodsbuttonLibraryAccessors(owner);
    private final CardinalcomponentsbaseLibraryAccessors laccForCardinalcomponentsbaseLibraryAccessors = new CardinalcomponentsbaseLibraryAccessors(owner);
    private final CardinalcomponentsblockLibraryAccessors laccForCardinalcomponentsblockLibraryAccessors = new CardinalcomponentsblockLibraryAccessors(owner);
    private final CardinalcomponentschunkLibraryAccessors laccForCardinalcomponentschunkLibraryAccessors = new CardinalcomponentschunkLibraryAccessors(owner);
    private final CardinalcomponentsentityLibraryAccessors laccForCardinalcomponentsentityLibraryAccessors = new CardinalcomponentsentityLibraryAccessors(owner);
    private final CardinalcomponentsworldLibraryAccessors laccForCardinalcomponentsworldLibraryAccessors = new CardinalcomponentsworldLibraryAccessors(owner);
    private final ClothLibraryAccessors laccForClothLibraryAccessors = new ClothLibraryAccessors(owner);
    private final CuriosLibraryAccessors laccForCuriosLibraryAccessors = new CuriosLibraryAccessors(owner);
    private final DiagonalblocksLibraryAccessors laccForDiagonalblocksLibraryAccessors = new DiagonalblocksLibraryAccessors(owner);
    private final EmiLibraryAccessors laccForEmiLibraryAccessors = new EmiLibraryAccessors(owner);
    private final ExtensibleenumsLibraryAccessors laccForExtensibleenumsLibraryAccessors = new ExtensibleenumsLibraryAccessors(owner);
    private final FabricapiLibraryAccessors laccForFabricapiLibraryAccessors = new FabricapiLibraryAccessors(owner);
    private final FabricloaderLibraryAccessors laccForFabricloaderLibraryAccessors = new FabricloaderLibraryAccessors(owner);
    private final ForgeconfigapiportLibraryAccessors laccForForgeconfigapiportLibraryAccessors = new ForgeconfigapiportLibraryAccessors(owner);
    private final HotbarslotcyclingLibraryAccessors laccForHotbarslotcyclingLibraryAccessors = new HotbarslotcyclingLibraryAccessors(owner);
    private final IteminteractionsLibraryAccessors laccForIteminteractionsLibraryAccessors = new IteminteractionsLibraryAccessors(owner);
    private final JeiLibraryAccessors laccForJeiLibraryAccessors = new JeiLibraryAccessors(owner);
    private final JeiapiLibraryAccessors laccForJeiapiLibraryAccessors = new JeiapiLibraryAccessors(owner);
    private final JeilibsLibraryAccessors laccForJeilibsLibraryAccessors = new JeilibsLibraryAccessors(owner);
    private final LimitlesscontainersLibraryAccessors laccForLimitlesscontainersLibraryAccessors = new LimitlesscontainersLibraryAccessors(owner);
    private final MinecraftforgeLibraryAccessors laccForMinecraftforgeLibraryAccessors = new MinecraftforgeLibraryAccessors(owner);
    private final MixinextrasLibraryAccessors laccForMixinextrasLibraryAccessors = new MixinextrasLibraryAccessors(owner);
    private final ModmenuLibraryAccessors laccForModmenuLibraryAccessors = new ModmenuLibraryAccessors(owner);
    private final NeoforgeLibraryAccessors laccForNeoforgeLibraryAccessors = new NeoforgeLibraryAccessors(owner);
    private final NeoforgedatapackextensionsLibraryAccessors laccForNeoforgedatapackextensionsLibraryAccessors = new NeoforgedatapackextensionsLibraryAccessors(owner);
    private final PlayerabilitylibLibraryAccessors laccForPlayerabilitylibLibraryAccessors = new PlayerabilitylibLibraryAccessors(owner);
    private final PuzzleslibLibraryAccessors laccForPuzzleslibLibraryAccessors = new PuzzleslibLibraryAccessors(owner);
    private final ReiLibraryAccessors laccForReiLibraryAccessors = new ReiLibraryAccessors(owner);
    private final ReiapiLibraryAccessors laccForReiapiLibraryAccessors = new ReiapiLibraryAccessors(owner);
    private final ReidefaultpluginLibraryAccessors laccForReidefaultpluginLibraryAccessors = new ReidefaultpluginLibraryAccessors(owner);
    private final StatuemenusLibraryAccessors laccForStatuemenusLibraryAccessors = new StatuemenusLibraryAccessors(owner);
    private final TrinketsLibraryAccessors laccForTrinketsLibraryAccessors = new TrinketsLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>nightconfigcore</b> with <b>com.electronwill.night-config:core</b> coordinates and
     * with version reference <b>nightconfig</b>
     * <p>
     * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getNightconfigcore() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("nightconfigcore");
    }

    /**
     * Dependency provider for <b>nightconfigtoml</b> with <b>com.electronwill.night-config:toml</b> coordinates and
     * with version reference <b>nightconfig</b>
     * <p>
     * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getNightconfigtoml() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("nightconfigtoml");
    }

    /**
     * Group of libraries at <b>appleskin</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public AppleskinLibraryAccessors getAppleskin() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForAppleskinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>architectury</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ArchitecturyLibraryAccessors getArchitectury() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForArchitecturyLibraryAccessors;
    }

    /**
     * Group of libraries at <b>bettermodsbutton</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BettermodsbuttonLibraryAccessors getBettermodsbutton() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForBettermodsbuttonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsbase</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CardinalcomponentsbaseLibraryAccessors getCardinalcomponentsbase() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCardinalcomponentsbaseLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsblock</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CardinalcomponentsblockLibraryAccessors getCardinalcomponentsblock() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCardinalcomponentsblockLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentschunk</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CardinalcomponentschunkLibraryAccessors getCardinalcomponentschunk() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCardinalcomponentschunkLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsentity</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CardinalcomponentsentityLibraryAccessors getCardinalcomponentsentity() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCardinalcomponentsentityLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsworld</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CardinalcomponentsworldLibraryAccessors getCardinalcomponentsworld() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCardinalcomponentsworldLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cloth</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ClothLibraryAccessors getCloth() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForClothLibraryAccessors;
    }

    /**
     * Group of libraries at <b>curios</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CuriosLibraryAccessors getCurios() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCuriosLibraryAccessors;
    }

    /**
     * Group of libraries at <b>diagonalblocks</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public DiagonalblocksLibraryAccessors getDiagonalblocks() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForDiagonalblocksLibraryAccessors;
    }

    /**
     * Group of libraries at <b>emi</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public EmiLibraryAccessors getEmi() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForEmiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>extensibleenums</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ExtensibleenumsLibraryAccessors getExtensibleenums() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForExtensibleenumsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>fabricapi</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public FabricapiLibraryAccessors getFabricapi() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForFabricapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>fabricloader</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public FabricloaderLibraryAccessors getFabricloader() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForFabricloaderLibraryAccessors;
    }

    /**
     * Group of libraries at <b>forgeconfigapiport</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ForgeconfigapiportLibraryAccessors getForgeconfigapiport() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForForgeconfigapiportLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hotbarslotcycling</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public HotbarslotcyclingLibraryAccessors getHotbarslotcycling() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForHotbarslotcyclingLibraryAccessors;
    }

    /**
     * Group of libraries at <b>iteminteractions</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public IteminteractionsLibraryAccessors getIteminteractions() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForIteminteractionsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jei</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JeiLibraryAccessors getJei() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJeiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jeiapi</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JeiapiLibraryAccessors getJeiapi() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJeiapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jeilibs</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JeilibsLibraryAccessors getJeilibs() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJeilibsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>limitlesscontainers</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public LimitlesscontainersLibraryAccessors getLimitlesscontainers() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForLimitlesscontainersLibraryAccessors;
    }

    /**
     * Group of libraries at <b>minecraftforge</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MinecraftforgeLibraryAccessors getMinecraftforge() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMinecraftforgeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mixinextras</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MixinextrasLibraryAccessors getMixinextras() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMixinextrasLibraryAccessors;
    }

    /**
     * Group of libraries at <b>modmenu</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ModmenuLibraryAccessors getModmenu() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForModmenuLibraryAccessors;
    }

    /**
     * Group of libraries at <b>neoforge</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public NeoforgeLibraryAccessors getNeoforge() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForNeoforgeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>neoforgedatapackextensions</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public NeoforgedatapackextensionsLibraryAccessors getNeoforgedatapackextensions() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForNeoforgedatapackextensionsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>playerabilitylib</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public PlayerabilitylibLibraryAccessors getPlayerabilitylib() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForPlayerabilitylibLibraryAccessors;
    }

    /**
     * Group of libraries at <b>puzzleslib</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public PuzzleslibLibraryAccessors getPuzzleslib() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForPuzzleslibLibraryAccessors;
    }

    /**
     * Group of libraries at <b>rei</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ReiLibraryAccessors getRei() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForReiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>reiapi</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ReiapiLibraryAccessors getReiapi() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForReiapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>reidefaultplugin</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ReidefaultpluginLibraryAccessors getReidefaultplugin() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForReidefaultpluginLibraryAccessors;
    }

    /**
     * Group of libraries at <b>statuemenus</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public StatuemenusLibraryAccessors getStatuemenus() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForStatuemenusLibraryAccessors;
    }

    /**
     * Group of libraries at <b>trinkets</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public TrinketsLibraryAccessors getTrinkets() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForTrinketsLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AppleskinLibraryAccessors extends SubDependencyFactory {

        public AppleskinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>squeek.appleskin:appleskin-fabric</b> coordinates and
         * with version reference <b>appleskin.fabric</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("appleskin.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>squeek.appleskin:appleskin-neoforge</b> coordinates and
         * with version reference <b>appleskin.neoforge</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("appleskin.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ArchitecturyLibraryAccessors extends SubDependencyFactory {

        public ArchitecturyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.architectury:architectury-fabric</b> coordinates and
         * with version reference <b>architectury</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("architectury.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>dev.architectury:architectury-neoforge</b> coordinates and
         * with version reference <b>architectury</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("architectury.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BettermodsbuttonLibraryAccessors extends SubDependencyFactory {

        public BettermodsbuttonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.bettermodsbutton:bettermodsbutton-forge</b> coordinates and
         * with version reference <b>bettermodsbutton</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getForge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("bettermodsbutton.forge");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.bettermodsbutton:bettermodsbutton-neoforge</b> coordinates and
         * with version reference <b>bettermodsbutton</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("bettermodsbutton.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CardinalcomponentsbaseLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsbaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-base</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cardinalcomponentsbase.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CardinalcomponentsblockLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsblockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-block</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cardinalcomponentsblock.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CardinalcomponentschunkLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentschunkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-chunk</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cardinalcomponentschunk.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CardinalcomponentsentityLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsentityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-entity</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cardinalcomponentsentity.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CardinalcomponentsworldLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsworldLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-world</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cardinalcomponentsworld.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ClothLibraryAccessors extends SubDependencyFactory {

        public ClothLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel.cloth:cloth-config-fabric</b> coordinates and
         * with version reference <b>cloth</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cloth.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>me.shedaniel.cloth:cloth-config-neoforge</b> coordinates and
         * with version reference <b>cloth</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("cloth.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CuriosLibraryAccessors extends SubDependencyFactory {

        public CuriosLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>neoforge</b> with <b>top.theillusivec4.curios:curios-neoforge</b> coordinates and
         * with version reference <b>curios</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("curios.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class DiagonalblocksLibraryAccessors extends SubDependencyFactory {

        public DiagonalblocksLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.diagonalblocks:diagonalblocks-common</b> coordinates and
         * with version reference <b>diagonalblocks</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("diagonalblocks.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.diagonalblocks:diagonalblocks-fabric</b> coordinates and
         * with version reference <b>diagonalblocks</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("diagonalblocks.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.diagonalblocks:diagonalblocks-neoforge</b> coordinates and
         * with version reference <b>diagonalblocks</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("diagonalblocks.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class EmiLibraryAccessors extends SubDependencyFactory {

        public EmiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>dev.emi:emi-xplat-mojmap</b> coordinates and
         * with version reference <b>emi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("emi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.emi:emi-fabric</b> coordinates and
         * with version reference <b>emi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("emi.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>dev.emi:emi-neoforge</b> coordinates and
         * with version reference <b>emi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("emi.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ExtensibleenumsLibraryAccessors extends SubDependencyFactory {

        public ExtensibleenumsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.extensibleenums:extensibleenums-common</b> coordinates and
         * with version reference <b>extensibleenums</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("extensibleenums.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.extensibleenums:extensibleenums-fabric</b> coordinates and
         * with version reference <b>extensibleenums</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("extensibleenums.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.extensibleenums:extensibleenums-neoforge</b> coordinates and
         * with version reference <b>extensibleenums</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("extensibleenums.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class FabricapiLibraryAccessors extends SubDependencyFactory {

        public FabricapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>net.fabricmc.fabric-api:fabric-api</b> coordinates and
         * with version reference <b>fabricapi.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("fabricapi.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class FabricloaderLibraryAccessors extends SubDependencyFactory {

        public FabricloaderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>net.fabricmc:fabric-loader</b> coordinates and
         * with version reference <b>fabricloader.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("fabricloader.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ForgeconfigapiportLibraryAccessors extends SubDependencyFactory {

        public ForgeconfigapiportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.forgeconfigapiport:forgeconfigapiport-common-neoforgeapi</b> coordinates and
         * with version reference <b>forgeconfigapiport</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("forgeconfigapiport.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.forgeconfigapiport:forgeconfigapiport-fabric</b> coordinates and
         * with version reference <b>forgeconfigapiport</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("forgeconfigapiport.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.forgeconfigapiport:forgeconfigapiport-forge</b> coordinates and
         * with version reference <b>forgeconfigapiport</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getForge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("forgeconfigapiport.forge");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.forgeconfigapiport:forgeconfigapiport-neoforge</b> coordinates and
         * with version reference <b>forgeconfigapiport</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("forgeconfigapiport.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class HotbarslotcyclingLibraryAccessors extends SubDependencyFactory {

        public HotbarslotcyclingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.hotbarslotcycling:hotbarslotcycling-common</b> coordinates and
         * with version reference <b>hotbarslotcycling</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hotbarslotcycling.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.hotbarslotcycling:hotbarslotcycling-fabric</b> coordinates and
         * with version reference <b>hotbarslotcycling</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hotbarslotcycling.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.hotbarslotcycling:hotbarslotcycling-neoforge</b> coordinates and
         * with version reference <b>hotbarslotcycling</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hotbarslotcycling.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IteminteractionsLibraryAccessors extends SubDependencyFactory {

        public IteminteractionsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.iteminteractions:iteminteractions-common</b> coordinates and
         * with version reference <b>iteminteractions</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("iteminteractions.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.iteminteractions:iteminteractions-fabric</b> coordinates and
         * with version reference <b>iteminteractions</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("iteminteractions.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.iteminteractions:iteminteractions-neoforge</b> coordinates and
         * with version reference <b>iteminteractions</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("iteminteractions.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JeiLibraryAccessors extends SubDependencyFactory {

        public JeiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>mezz.jei:jei-1.21.1-fabric</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jei.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>mezz.jei:jei-1.21.1-neoforge</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jei.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JeiapiLibraryAccessors extends SubDependencyFactory {

        public JeiapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>mezz.jei:jei-1.21.1-common-api</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jeiapi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>mezz.jei:jei-1.21.1-fabric-api</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jeiapi.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>mezz.jei:jei-1.21.1-neoforge-api</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jeiapi.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JeilibsLibraryAccessors extends SubDependencyFactory {

        public JeilibsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>mezz.jei:jei-1.21.1-lib</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jeilibs.common");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class LimitlesscontainersLibraryAccessors extends SubDependencyFactory {

        public LimitlesscontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.limitlesscontainers:limitlesscontainers-common</b> coordinates and
         * with version reference <b>limitlesscontainers</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("limitlesscontainers.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.limitlesscontainers:limitlesscontainers-fabric</b> coordinates and
         * with version reference <b>limitlesscontainers</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("limitlesscontainers.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.limitlesscontainers:limitlesscontainers-neoforge</b> coordinates and
         * with version reference <b>limitlesscontainers</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("limitlesscontainers.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MinecraftforgeLibraryAccessors extends SubDependencyFactory {

        public MinecraftforgeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>forge</b> with <b>net.minecraftforge:forge</b> coordinates and
         * with version reference <b>minecraftforge.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getForge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("minecraftforge.forge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MixinextrasLibraryAccessors extends SubDependencyFactory {

        public MixinextrasLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>io.github.llamalad7:mixinextras-common</b> coordinates and
         * with version reference <b>mixinextras.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("mixinextras.common");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>io.github.llamalad7:mixinextras-forge</b> coordinates and
         * with version reference <b>mixinextras.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getForge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("mixinextras.forge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ModmenuLibraryAccessors extends SubDependencyFactory {

        public ModmenuLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>com.terraformersmc:modmenu</b> coordinates and
         * with version reference <b>modmenu</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("modmenu.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NeoforgeLibraryAccessors extends SubDependencyFactory {

        public NeoforgeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>neoforge</b> with <b>net.neoforged:neoforge</b> coordinates and
         * with version reference <b>neoforge.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("neoforge.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NeoforgedatapackextensionsLibraryAccessors extends SubDependencyFactory {

        public NeoforgedatapackextensionsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.neoforgedatapackextensions:neoforgedatapackextensions-common</b> coordinates and
         * with version reference <b>neoforgedatapackextensions</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("neoforgedatapackextensions.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.neoforgedatapackextensions:neoforgedatapackextensions-fabric</b> coordinates and
         * with version reference <b>neoforgedatapackextensions</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("neoforgedatapackextensions.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.neoforgedatapackextensions:neoforgedatapackextensions-neoforge</b> coordinates and
         * with version reference <b>neoforgedatapackextensions</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("neoforgedatapackextensions.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class PlayerabilitylibLibraryAccessors extends SubDependencyFactory {

        public PlayerabilitylibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>io.github.ladysnake:PlayerAbilityLib</b> coordinates and
         * with version reference <b>playerabilitylib</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("playerabilitylib.fabric");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class PuzzleslibLibraryAccessors extends SubDependencyFactory {

        public PuzzleslibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.puzzleslib:puzzleslib-common</b> coordinates and
         * with version reference <b>puzzleslib.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("puzzleslib.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.puzzleslib:puzzleslib-fabric</b> coordinates and
         * with version reference <b>puzzleslib.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("puzzleslib.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.puzzleslib:puzzleslib-neoforge</b> coordinates and
         * with version reference <b>puzzleslib.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("puzzleslib.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ReiLibraryAccessors extends SubDependencyFactory {

        public ReiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel:RoughlyEnoughItems-fabric</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("rei.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>me.shedaniel:RoughlyEnoughItems-neoforge</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("rei.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ReiapiLibraryAccessors extends SubDependencyFactory {

        public ReiapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>me.shedaniel:RoughlyEnoughItems-api</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("reiapi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel:RoughlyEnoughItems-api-fabric</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("reiapi.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>me.shedaniel:RoughlyEnoughItems-api-neoforge</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("reiapi.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ReidefaultpluginLibraryAccessors extends SubDependencyFactory {

        public ReidefaultpluginLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>me.shedaniel:RoughlyEnoughItems-default-plugin</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("reidefaultplugin.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel:RoughlyEnoughItems-default-plugin-fabric</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("reidefaultplugin.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>me.shedaniel:RoughlyEnoughItems-default-plugin-neoforge</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("reidefaultplugin.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class StatuemenusLibraryAccessors extends SubDependencyFactory {

        public StatuemenusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.statuemenus:statuemenus-common</b> coordinates and
         * with version reference <b>statuemenus</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("statuemenus.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.statuemenus:statuemenus-fabric</b> coordinates and
         * with version reference <b>statuemenus</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("statuemenus.fabric");
        }

        /**
         * Dependency provider for <b>neoforge</b> with <b>fuzs.statuemenus:statuemenus-neoforge</b> coordinates and
         * with version reference <b>statuemenus</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getNeoforge() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("statuemenus.neoforge");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class TrinketsLibraryAccessors extends SubDependencyFactory {

        public TrinketsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.emi:trinkets</b> coordinates and
         * with version reference <b>trinkets</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getFabric() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("trinkets.fabric");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AppleskinVersionAccessors vaccForAppleskinVersionAccessors = new AppleskinVersionAccessors(providers, config);
        private final ArchitecturyloomVersionAccessors vaccForArchitecturyloomVersionAccessors = new ArchitecturyloomVersionAccessors(providers, config);
        private final ArchitecturypluginVersionAccessors vaccForArchitecturypluginVersionAccessors = new ArchitecturypluginVersionAccessors(providers, config);
        private final CursegradleVersionAccessors vaccForCursegradleVersionAccessors = new CursegradleVersionAccessors(providers, config);
        private final FabricapiVersionAccessors vaccForFabricapiVersionAccessors = new FabricapiVersionAccessors(providers, config);
        private final FabricloaderVersionAccessors vaccForFabricloaderVersionAccessors = new FabricloaderVersionAccessors(providers, config);
        private final FabricloomVersionAccessors vaccForFabricloomVersionAccessors = new FabricloomVersionAccessors(providers, config);
        private final LibrarianVersionAccessors vaccForLibrarianVersionAccessors = new LibrarianVersionAccessors(providers, config);
        private final MinecraftforgeVersionAccessors vaccForMinecraftforgeVersionAccessors = new MinecraftforgeVersionAccessors(providers, config);
        private final MinecraftforgegradleVersionAccessors vaccForMinecraftforgegradleVersionAccessors = new MinecraftforgegradleVersionAccessors(providers, config);
        private final MinotaurVersionAccessors vaccForMinotaurVersionAccessors = new MinotaurVersionAccessors(providers, config);
        private final MixinVersionAccessors vaccForMixinVersionAccessors = new MixinVersionAccessors(providers, config);
        private final MixinextrasVersionAccessors vaccForMixinextrasVersionAccessors = new MixinextrasVersionAccessors(providers, config);
        private final NeoforgeVersionAccessors vaccForNeoforgeVersionAccessors = new NeoforgeVersionAccessors(providers, config);
        private final NeoforgegradleVersionAccessors vaccForNeoforgegradleVersionAccessors = new NeoforgegradleVersionAccessors(providers, config);
        private final ParchmentVersionAccessors vaccForParchmentVersionAccessors = new ParchmentVersionAccessors(providers, config);
        private final PuzzleslibVersionAccessors vaccForPuzzleslibVersionAccessors = new PuzzleslibVersionAccessors(providers, config);
        private final ShadowVersionAccessors vaccForShadowVersionAccessors = new ShadowVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>architectury</b> with value <b>13.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getArchitectury() { return getVersion("architectury"); }

        /**
         * Version alias <b>bettermodsbutton</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getBettermodsbutton() { return getVersion("bettermodsbutton"); }

        /**
         * Version alias <b>cardinalcomponents</b> with value <b>6.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getCardinalcomponents() { return getVersion("cardinalcomponents"); }

        /**
         * Version alias <b>cloth</b> with value <b>15.0.127</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getCloth() { return getVersion("cloth"); }

        /**
         * Version alias <b>curios</b> with value <b>9.0.9+1.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getCurios() { return getVersion("curios"); }

        /**
         * Version alias <b>data</b> with value <b>48</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getData() { return getVersion("data"); }

        /**
         * Version alias <b>diagonalblocks</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getDiagonalblocks() { return getVersion("diagonalblocks"); }

        /**
         * Version alias <b>emi</b> with value <b>1.1.13+1.21.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getEmi() { return getVersion("emi"); }

        /**
         * Version alias <b>extensibleenums</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getExtensibleenums() { return getVersion("extensibleenums"); }

        /**
         * Version alias <b>forgeconfigapiport</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getForgeconfigapiport() { return getVersion("forgeconfigapiport"); }

        /**
         * Version alias <b>hotbarslotcycling</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getHotbarslotcycling() { return getVersion("hotbarslotcycling"); }

        /**
         * Version alias <b>iteminteractions</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getIteminteractions() { return getVersion("iteminteractions"); }

        /**
         * Version alias <b>java</b> with value <b>21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getJava() { return getVersion("java"); }

        /**
         * Version alias <b>jei</b> with value <b>19.16.4.170</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getJei() { return getVersion("jei"); }

        /**
         * Version alias <b>limitlesscontainers</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getLimitlesscontainers() { return getVersion("limitlesscontainers"); }

        /**
         * Version alias <b>minecraft</b> with value <b>1.21.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMinecraft() { return getVersion("minecraft"); }

        /**
         * Version alias <b>modmenu</b> with value <b>11.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getModmenu() { return getVersion("modmenu"); }

        /**
         * Version alias <b>neoforgedatapackextensions</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getNeoforgedatapackextensions() { return getVersion("neoforgedatapackextensions"); }

        /**
         * Version alias <b>nightconfig</b> with value <b>3.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getNightconfig() { return getVersion("nightconfig"); }

        /**
         * Version alias <b>playerabilitylib</b> with value <b>1.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getPlayerabilitylib() { return getVersion("playerabilitylib"); }

        /**
         * Version alias <b>rei</b> with value <b>16.0.762</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getRei() { return getVersion("rei"); }

        /**
         * Version alias <b>resources</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getResources() { return getVersion("resources"); }

        /**
         * Version alias <b>statuemenus</b> with value <b>21.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getStatuemenus() { return getVersion("statuemenus"); }

        /**
         * Version alias <b>trinkets</b> with value <b>3.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getTrinkets() { return getVersion("trinkets"); }

        /**
         * Group of versions at <b>versions.appleskin</b>
         */
        public AppleskinVersionAccessors getAppleskin() {
            return vaccForAppleskinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.architecturyloom</b>
         */
        public ArchitecturyloomVersionAccessors getArchitecturyloom() {
            return vaccForArchitecturyloomVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.architecturyplugin</b>
         */
        public ArchitecturypluginVersionAccessors getArchitecturyplugin() {
            return vaccForArchitecturypluginVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.cursegradle</b>
         */
        public CursegradleVersionAccessors getCursegradle() {
            return vaccForCursegradleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.fabricapi</b>
         */
        public FabricapiVersionAccessors getFabricapi() {
            return vaccForFabricapiVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.fabricloader</b>
         */
        public FabricloaderVersionAccessors getFabricloader() {
            return vaccForFabricloaderVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.fabricloom</b>
         */
        public FabricloomVersionAccessors getFabricloom() {
            return vaccForFabricloomVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.librarian</b>
         */
        public LibrarianVersionAccessors getLibrarian() {
            return vaccForLibrarianVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.minecraftforge</b>
         */
        public MinecraftforgeVersionAccessors getMinecraftforge() {
            return vaccForMinecraftforgeVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.minecraftforgegradle</b>
         */
        public MinecraftforgegradleVersionAccessors getMinecraftforgegradle() {
            return vaccForMinecraftforgegradleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.minotaur</b>
         */
        public MinotaurVersionAccessors getMinotaur() {
            return vaccForMinotaurVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.mixin</b>
         */
        public MixinVersionAccessors getMixin() {
            return vaccForMixinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.mixinextras</b>
         */
        public MixinextrasVersionAccessors getMixinextras() {
            return vaccForMixinextrasVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.neoforge</b>
         */
        public NeoforgeVersionAccessors getNeoforge() {
            return vaccForNeoforgeVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.neoforgegradle</b>
         */
        public NeoforgegradleVersionAccessors getNeoforgegradle() {
            return vaccForNeoforgegradleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.parchment</b>
         */
        public ParchmentVersionAccessors getParchment() {
            return vaccForParchmentVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.puzzleslib</b>
         */
        public PuzzleslibVersionAccessors getPuzzleslib() {
            return vaccForPuzzleslibVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.shadow</b>
         */
        public ShadowVersionAccessors getShadow() {
            return vaccForShadowVersionAccessors;
        }

    }

    public static class AppleskinVersionAccessors extends VersionFactory  {

        public AppleskinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>appleskin.fabric</b> with value <b>mc1.21-3.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getFabric() { return getVersion("appleskin.fabric"); }

        /**
         * Version alias <b>appleskin.neoforge</b> with value <b>mc1.21-3.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getNeoforge() { return getVersion("appleskin.neoforge"); }

    }

    public static class ArchitecturyloomVersionAccessors extends VersionFactory  {

        public ArchitecturyloomVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>architecturyloom.version</b> with value <b>1.7-SNAPSHOT</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("architecturyloom.version"); }

    }

    public static class ArchitecturypluginVersionAccessors extends VersionFactory  {

        public ArchitecturypluginVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>architecturyplugin.version</b> with value <b>3.4-SNAPSHOT</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("architecturyplugin.version"); }

    }

    public static class CursegradleVersionAccessors extends VersionFactory  {

        public CursegradleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>cursegradle.version</b> with value <b>2.+</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("cursegradle.version"); }

    }

    public static class FabricapiVersionAccessors extends VersionFactory  {

        public FabricapiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabricapi.min</b> with value <b>0.102.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMin() { return getVersion("fabricapi.min"); }

        /**
         * Version alias <b>fabricapi.version</b> with value <b>0.103.0+1.21.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("fabricapi.version"); }

    }

    public static class FabricloaderVersionAccessors extends VersionFactory  {

        public FabricloaderVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabricloader.min</b> with value <b>0.16.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMin() { return getVersion("fabricloader.min"); }

        /**
         * Version alias <b>fabricloader.version</b> with value <b>0.16.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("fabricloader.version"); }

    }

    public static class FabricloomVersionAccessors extends VersionFactory  {

        public FabricloomVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabricloom.version</b> with value <b>1.7-SNAPSHOT</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("fabricloom.version"); }

    }

    public static class LibrarianVersionAccessors extends VersionFactory  {

        public LibrarianVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>librarian.version</b> with value <b>1.+</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("librarian.version"); }

    }

    public static class MinecraftforgeVersionAccessors extends VersionFactory  {

        public MinecraftforgeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>minecraftforge.min</b> with value <b>52.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMin() { return getVersion("minecraftforge.min"); }

        /**
         * Version alias <b>minecraftforge.version</b> with value <b>1.21.1-52.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("minecraftforge.version"); }

    }

    public static class MinecraftforgegradleVersionAccessors extends VersionFactory  {

        public MinecraftforgegradleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>minecraftforgegradle.version</b> with value <b>6.+</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("minecraftforgegradle.version"); }

    }

    public static class MinotaurVersionAccessors extends VersionFactory  {

        public MinotaurVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>minotaur.version</b> with value <b>2.+</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("minotaur.version"); }

    }

    public static class MixinVersionAccessors extends VersionFactory  {

        public MixinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>mixin.version</b> with value <b>0.7.+</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("mixin.version"); }

    }

    public static class MixinextrasVersionAccessors extends VersionFactory  {

        public MixinextrasVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>mixinextras.version</b> with value <b>0.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("mixinextras.version"); }

    }

    public static class NeoforgeVersionAccessors extends VersionFactory  {

        public NeoforgeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>neoforge.min</b> with value <b>21.1.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMin() { return getVersion("neoforge.min"); }

        /**
         * Version alias <b>neoforge.version</b> with value <b>21.1.49</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("neoforge.version"); }

    }

    public static class NeoforgegradleVersionAccessors extends VersionFactory  {

        public NeoforgegradleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>neoforgegradle.version</b> with value <b>7.+</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("neoforgegradle.version"); }

    }

    public static class ParchmentVersionAccessors extends VersionFactory  {

        public ParchmentVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>parchment.minecraft</b> with value <b>1.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMinecraft() { return getVersion("parchment.minecraft"); }

        /**
         * Version alias <b>parchment.version</b> with value <b>2024.07.28</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("parchment.version"); }

    }

    public static class PuzzleslibVersionAccessors extends VersionFactory  {

        public PuzzleslibVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>puzzleslib.min</b> with value <b>21.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getMin() { return getVersion("puzzleslib.min"); }

        /**
         * Version alias <b>puzzleslib.version</b> with value <b>21.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("puzzleslib.version"); }

    }

    public static class ShadowVersionAccessors extends VersionFactory  {

        public ShadowVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>shadow.version</b> with value <b>7.1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<String> getVersion() { return getVersion("shadow.version"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>architecturyloom</b> with plugin id <b>dev.architectury.loom</b> and
         * with version reference <b>architecturyloom.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getArchitecturyloom() { return createPlugin("architecturyloom"); }

        /**
         * Plugin provider for <b>architecturyplugin</b> with plugin id <b>architectury-plugin</b> and
         * with version reference <b>architecturyplugin.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getArchitecturyplugin() { return createPlugin("architecturyplugin"); }

        /**
         * Plugin provider for <b>cursegradle</b> with plugin id <b>me.hypherionmc.cursegradle</b> and
         * with version reference <b>cursegradle.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getCursegradle() { return createPlugin("cursegradle"); }

        /**
         * Plugin provider for <b>fabricloom</b> with plugin id <b>fabric-loom</b> and
         * with version reference <b>fabricloom.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getFabricloom() { return createPlugin("fabricloom"); }

        /**
         * Plugin provider for <b>librarian</b> with plugin id <b>org.parchmentmc.librarian.forgegradle</b> and
         * with version reference <b>librarian.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getLibrarian() { return createPlugin("librarian"); }

        /**
         * Plugin provider for <b>minecraftforgegradle</b> with plugin id <b>net.minecraftforge.gradle</b> and
         * with version reference <b>minecraftforgegradle.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getMinecraftforgegradle() { return createPlugin("minecraftforgegradle"); }

        /**
         * Plugin provider for <b>minotaur</b> with plugin id <b>com.modrinth.minotaur</b> and
         * with version reference <b>minotaur.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getMinotaur() { return createPlugin("minotaur"); }

        /**
         * Plugin provider for <b>mixin</b> with plugin id <b>org.spongepowered.mixin</b> and
         * with version reference <b>mixin.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getMixin() { return createPlugin("mixin"); }

        /**
         * Plugin provider for <b>neoforgegradle</b> with plugin id <b>net.neoforged.gradle.userdev</b> and
         * with version reference <b>neoforgegradle.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getNeoforgegradle() { return createPlugin("neoforgegradle"); }

        /**
         * Plugin provider for <b>shadow</b> with plugin id <b>com.github.johnrengelman.shadow</b> and
         * with version reference <b>shadow.version</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.21.1-v4
         */
        public Provider<PluginDependency> getShadow() { return createPlugin("shadow"); }

    }

}
