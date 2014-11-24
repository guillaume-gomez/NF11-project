// Generated from grammar/Logo.g4 by ANTLR 4.2

  package logoparsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#supzero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupzero(@NotNull LogoParser.SupzeroContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull LogoParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#hasard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasard(@NotNull LogoParser.HasardContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTg(@NotNull LogoParser.TgContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(@NotNull LogoParser.SumContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#infzero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfzero(@NotNull LogoParser.InfzeroContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#proced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProced(@NotNull LogoParser.ProcedContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#sup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSup(@NotNull LogoParser.SupContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(@NotNull LogoParser.ReContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#fonc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonc(@NotNull LogoParser.FoncContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#exec_fonc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_fonc(@NotNull LogoParser.Exec_foncContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#exec_proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_proc(@NotNull LogoParser.Exec_procContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#NotEgal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEgal(@NotNull LogoParser.NotEgalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull LogoParser.LoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#ve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVe(@NotNull LogoParser.VeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#bc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBc(@NotNull LogoParser.BcContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#resVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResVar(@NotNull LogoParser.ResVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull LogoParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#egal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEgal(@NotNull LogoParser.EgalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#inf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInf(@NotNull LogoParser.InfContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(@NotNull LogoParser.ParentContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#tantque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTantque(@NotNull LogoParser.TantqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#repete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepete(@NotNull LogoParser.RepeteContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#av}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAv(@NotNull LogoParser.AvContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(@NotNull LogoParser.SiContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull LogoParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(@NotNull LogoParser.ProgrammeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#bloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc(@NotNull LogoParser.BlocContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#execfonc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecfonc(@NotNull LogoParser.ExecfoncContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#fpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpos(@NotNull LogoParser.FposContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#lc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLc(@NotNull LogoParser.LcContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#nomVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomVariable(@NotNull LogoParser.NomVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#fcc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcc(@NotNull LogoParser.FccContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#execProced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProced(@NotNull LogoParser.ExecProcedContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#vari}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVari(@NotNull LogoParser.VariContext ctx);
}