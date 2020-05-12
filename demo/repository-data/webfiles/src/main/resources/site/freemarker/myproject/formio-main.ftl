<#include "../include/imports.ftl"/>
<#-- @ftlvariable name="document" type="org.example.beans.Formdocument" -->

<#--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">-->
<#--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">-->
<#if document??>
  <@hst.componentRenderingURL var="componentRenderingURL"/>
<@hst.headContribution category="css" keyHint="formiocss">
    <link rel="stylesheet" href="https://unpkg.com/formiojs@latest/dist/formio.full.min.css"/>
</@hst.headContribution>
<@hst.headContribution category="js" keyHint="formiojs">
    <script src="https://unpkg.com/formiojs@latest/dist/formio.full.min.js"></script>
</@hst.headContribution>

<@hst.headContribution category="scripts">
    <script type="text/javascript">
      window.onload = function() {
        Formio.icons = 'fontawesome';
        Formio.createForm(document.getElementById('formio-${componentRenderingURL}'), 'http://localhost:3001/${document.formPath}');
        <#--Formio.createForm(document.getElementById('formio-${componentRenderingURL}'), 'https://examples.form.io/w4', {-->
        <#--  zoom: '-20'-->
        <#--});-->
      };
    </script>
</@hst.headContribution>
<article class="has-edit-button">
  <h3>${document.title?html}</h3><@hst.manageContent hippobean=document/>
  <div id="formio-${componentRenderingURL}"></div>
</article>

</#if>
