/**
 *  Validação formulário
* @author Marcos Severino Alves
 */
function validar(){
	let nomecliente = frmClientes.nomecliente.value
	let cpf = frmClientes.cpf.value
	let sexo = frmClientes.sexo.value
	let email = frmClientes.email.value
	let telefone = frmClientes.telefone.value
	let tipo = frmClientes.tipo.value
	let logradouro = frmClientes.logradouro.value
	let numero = frmClientes.numero.value
	let complemento = frmClientes.complemento.value
	let bairro = frmClientes.bairro.value
	let cep = frmClientes.cep.value
	let nomeusuario = frmClientes.nomeusuario.value
	let senha = frmClientes.senha.value
	
	
	if (nomecliente === "") {
		alert ('Preencha o campo nome')
		frmClientes.nomecliente.focus
		return false
		}else if (cpf === ""){
			alert ('Preencha o campo cpf')
		frmClientes.cpf.focus()
		}else{
			document.forms["frmClientes"].submit()
		}
}